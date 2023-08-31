import com.zheng.analyse.spark.model.BizException;
import com.zheng.analyse.spark.model.ColunmObj;
import com.zheng.analyse.spark.model.SqlParseVO;
import com.zheng.analyse.starrocks.StarRockslHelper;
import org.junit.Test;

import java.util.List;

public class StarRocksUtilTest {
    @Test
    public void createTableTest() {
        String sql = " create table `dwd`.`dqc_test_partition`(\n" +
                "  `id` BIGINT comment '中文',\n" +
                "  `name` ARRAY<BIGINT>,\n" +
                "  `status` ARRAY<TIMESTAMP>,\n" +
                "  `amount` BIGINT) \n" +
                "comment '数据质量分区表' \n" +
                "partitioned by (\n" +
                "  `bizdate` STRING comment '1') \n" +
                "stored as orc\n ";

        SqlParseVO res = StarRockslHelper.parseSql(sql);
        System.out.println(res.toString());
    }

    @Test
    public void createTableAsSelectTest() {
        String sql = "create table IF NOT EXISTS tdl_users_1 as select * from users a left outer join address b on a.addr_id = b.id";
         sql = "create table tdl_users_1 as " +
                 "select a.col1,b.col2 from users a " +
                 "left outer join (select concat(c1,c2) col2,id from tab2)  b on a.addr_id = b.id";

        SqlParseVO res = StarRockslHelper.parseSql(sql);
        System.out.println(res);
    }

    @Test
    public void selectTest() {
        String sql = "select distinct o.`supplier_org_id` obj_col_value, \n" +
                "case \n" +
                " when  m.`trade_amount`<500  then '<500' \n" +
                " when  (m.`trade_amount`>=500 AND m.`trade_amount`<=1000)  then '5000-1000' \n" +
                " when  m.`trade_amount`>1000  then '>1000' \n" +
                " else 'non' end label_value \n" +
                " from hive.dim.dim_supplier_org o  \n" +
                " inner join hive.dws.dws_supplier m \n" +
                " on o.supplier_org_id=m.supplier_org_id    \n" +
                "having label_value !='non'    ";

        SqlParseVO res = StarRockslHelper.parseSql(sql);
        List<ColunmObj> colList = res.getInputFullColList();

        if (!"obj_id".equals(colList.get(0).getAlias()) || !"label_value".equals(colList.get(1).getAlias())) {
            throw new BizException("SQL错误，SQL第一列别名须为obj_col_value，第二列别名须为label_value");
        }
        System.out.println(res);
    }

    @Test
    public void withTest() {
        String sql = "with data as (select org_id, \n" +
                "                     category, \n" +
                "                     rule_id, \n" +
                "                     score, \n" +
                "                     created_at, \n" +
                "                     case \n" +
                "                         when created_at < date_add(date_trunc('DD', current_date), -180) then 'C' \n" +
                "                         when created_at < date_add(date_trunc('DD', current_date), -30) then 'B' \n" +
                "                         when created_at < date_trunc('DD', current_date) then 'A' \n" +
                "                         else null end as period_tag \n" +
                "              from ads_credit.merge_integrity_data \n" +
                "              where rule_id in (9, 10, 11, 12)  \n" +
                "                and status = 1  and org_id is not null and category='0202' \n" +
                "                and created_at < date_trunc('DD', current_date) \n" +
                ") \n" +
                "select * \n" +
                "from data \n" +
                "where data.period_tag is not null \n";

        SqlParseVO res = StarRockslHelper.parseSql(sql);
        System.out.println(res);
    }

    @Test
    public void withInsertTest() {
        String sql = "WITH tmp1 AS\n" +
                "    (SELECT cast(member_id AS string) AS member_id,\n" +
                "            account_created_date,\n" +
                "            case when account_created_date is null then 0 else 1 end as is_openaccount,\n" +
                "            CASE\n" + "                WHEN accum_deposit_times>0 THEN 1\n" +
                "                ELSE 0\n" + "            END AS is_deposit,\n" +
                "            CASE\n" +
                "                WHEN accum_rollin_times>0 THEN 1\n" +
                "                ELSE 0\n" +
                "            END AS is_rollin,\n" +
                "            CASE\n" +
                "                WHEN accum_trade_times>0 THEN 1\n" +
                "                ELSE 0\n" +
                "            END AS is_deal,\n" +
                "            CASE\n" +
                "                WHEN accum_withdraw_times>0 THEN 1\n" +
                "                ELSE 0\n" +
                "            END AS is_withdraw,\n" +
                "            CASE\n" +
                "                WHEN accum_rollout_times>0 THEN 1\n" +
                "                ELSE 0\n" +
                "            END AS is_rollout\n" +
                "     FROM lb_bi_presto.member_properties\n" +
                "     WHERE pt='20210812'\n" +
                "     GROUP BY cast(member_id AS string),\n" +
                "              account_created_date,\n" +
                "              case when account_created_date is null then 1 else 0 end,\n" +
                "              CASE\n" +
                "                  WHEN accum_deposit_times>0 THEN 1\n" +
                "                  ELSE 0\n" +
                "              END,\n" +
                "              CASE\n" +
                "                  WHEN accum_rollin_times>0 THEN 1\n" +
                "                  ELSE 0\n" +
                "              END,\n" +
                "              CASE\n" +
                "                  WHEN accum_trade_times>0 THEN 1\n" +
                "                  ELSE 0\n" +
                "              END,\n" +
                "              CASE\n" +
                "                  WHEN accum_withdraw_times>0 THEN 1\n" +
                "                  ELSE 0\n" +
                "              END,\n" +
                "              CASE\n" +
                "                  WHEN accum_rollout_times>0 THEN 1\n" +
                "                  ELSE 0\n" + "              END),\n" +
                "        tmp2 AS\n" +
                "    (SELECT *\n" +
                "     FROM lb_bi_user.dws_user_profile_attribution_invite_d\n" +
                "     WHERE pt='20210812'),\n" +
                "     tmp3 as (select member_id,\n" +
                "                     case when state=0 then '初始化' when state=1 then '身份信息已认证' when state=2 then '已通过活体验证' when state=3 then '用户提交中'\n" +
                "                     when state=4 then '用户提交待确认' when state=5 then '用户已提交' when state=6 then '等待提交给辉立' when state=7 then '辉立审核中'\n" +
                "                     when state=8 then '审核失败' when state=9 then '开户完成'\n" +
                "                     end as open_account_status\n" +
                "              from lb_member_service.account_applications\n" + "     )\n" +
                "    INSERT overwrite TABLE lb_bi_user.dim_user_profile_attribution_dynamic_d partition(pt='20210812')\n" +
                "    SELECT tmp1.member_id,\n" +
                "         tmp1.account_created_date,\n" +
                "         tmp1.is_openaccount,\n" +
                "         tmp1.is_deposit,\n" +
                "         tmp1.is_rollin,\n" +
                "         tmp1.is_deal,\n" +
                "         tmp1.is_withdraw,\n" +
                "         tmp1.is_rollout,\n" +
                "         CASE\n" +
                "             WHEN tmp2.invite_num_all>0 THEN 1\n" +
                "             ELSE 0\n" +
                "         END AS is_inviter,\n" +
                "         nvl(tmp2.invite_num_all,0) AS invite_num_all,\n" +
                "         nvl(tmp2.invite_num_30,0) AS invite_num_30,\n" +
                "         tmp3.open_account_status\n" +
                "    FROM tmp1\n" +
                "    LEFT JOIN tmp2 ON tmp1.member_id=tmp2.member_id\n" +
                "    left join tmp3 on tmp1.member_id=tmp3.member_id\n" +
                "    GROUP BY tmp1.member_id,\n" +
                "         tmp1.account_created_date,\n" +
                "         tmp1.is_openaccount,\n" +
                "         tmp1.is_deposit,\n" +
                "         tmp1.is_rollin,\n" +
                "         tmp1.is_deal,\n" +
                "         tmp1.is_withdraw,\n" +
                "         tmp1.is_rollout,\n" +
                "         CASE\n" +
                "             WHEN tmp2.invite_num_all>0 THEN 1\n" +
                "             ELSE 0\n" +
                "         END,\n" +
                "         nvl(tmp2.invite_num_all,0),\n" +
                "         nvl(tmp2.invite_num_30,0),\n" +
                "         tmp3.open_account_status";

        SqlParseVO res = StarRockslHelper.parseSql(sql);
        System.out.println(res);
    }

    @Test
    public void insertTest() {
        String sql = "insert into table users PARTITION(ds='20170220') values('NAME')";

        SqlParseVO res = StarRockslHelper.parseSql(sql);
        System.out.println(res);
    }

    @Test
    public void insertSelectTest() {
        String sql = "insert into table test select d.id from file_download d  left join file_transfer t on t.id = d.transfer_id";
        sql = "insert overwrite table cite select * from (select a from tab2) c";
        sql = "INSERT INTO TABLE db_test.table_result SELECT t1.id, t2.name FROM ( SELECT concat(concat(id1 , id2),id3) AS id FROM db_test.table1 ) t1 LEFT JOIN ( SELECT id, name FROM ( SELECT id, sourcename AS name FROM db_test.table2 ) ) t2 ON t1.id=t2.id";
        sql = "insert overwrite table ads.ads_item_sales_statistics partition(pt = 'yesterday') \n" +
                "select item_id, supplier_org_id, instance_code, item_quantity_30d \n" +
                "  from ads.ads_item_sales_statistics \n" +
                " where pt = 'today'   \n";

        SqlParseVO res = StarRockslHelper.parseSql(sql);
        System.out.println(res);
    }

    @Test
    public void test() {
        String sql = "insert into table test select d.id from file_download d  left join file_transfer t on t.id = d.transfer_id";
        sql = "insert overwrite table cite select * from (select a from tab2) c";
        sql = "INSERT INTO TABLE db_test.table_result " +
                "SELECT t1.id, t2.name " +
                "FROM (SELECT concat(concat(id1 , id2),id3) AS id FROM db_test.table1 ) t1 " +
                "LEFT JOIN ( SELECT id, name FROM ( SELECT id, sourcename AS name FROM db_test.table2 ) ) t2 ON t1.id=t2.id";

        SqlParseVO res = StarRockslHelper.parseSql(sql);
        System.out.println(res);
    }



    @Test
    public void testAlter() {
        //修改字段
        String sql = "alter table abd.test_tab change column col_old col_1 int comment 'mark'";
        //新增字段
        sql = "alter table abd.test_tab add columns(`col` int comment 'col_1',col_2 string)";
        sql = "alter table abd.test_tab add columns(`col` int comment 'col_1',col_2 string)";

        SqlParseVO res = StarRockslHelper.parseSql(sql);
        System.out.println(res);
    }
}
