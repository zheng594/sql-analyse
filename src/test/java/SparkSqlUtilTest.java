import com.zheng.analyse.spark.SparkSqlHelper;
import com.zheng.analyse.spark.model.SqlParseVO;
import org.junit.Test;

public class SparkSqlUtilTest {

    @Test
    public void selectTest() {
//        String sql = "select d.id from file_download d \n" + "left join file_transfer t on t.id = d.transfer_id\n" + "where d.id in (select id from test)";
        String sql = " create table `dwd`.`dqc_test_partition`(\n" +
                "  `id` BIGINT comment '中文',\n" +
                "  `name` ARRAY<BIGINT>,\n" +
                "  `status` ARRAY<TIMESTAMP>,\n" +
                "  `amount` BIGINT) \n" +
                "comment '数据质量分区表' \n" +
                "partitioned by (\n" +
                "  `bizdate` STRING comment '1') \n" +
                "stored as orc\n ";

        SqlParseVO res = SparkSqlHelper.parseSql(sql);
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

        SqlParseVO res = SparkSqlHelper.parseSql(sql);
        System.out.println(res);
    }
}
