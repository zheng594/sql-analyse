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


}
