package com.zheng.analyse;

import com.zheng.analyse.presto.PrestolHelper;
import com.zheng.analyse.spark.SparkSqlHelper;
import com.zheng.analyse.spark.model.BizException;
import com.zheng.analyse.spark.model.SqlParseVO;
import com.zheng.analyse.starrocks.StarRockslHelper;
import org.apache.commons.lang3.StringUtils;

/**
 * sql解析通用入口
 */
public class SqlParseUtils {
    public static SqlParseVO parse(String type, String sql) {
        DatasourceTypeEnum typeEnum = DatasourceTypeEnum.MAP.get(type);
        if (typeEnum == null) {
            throw new BizException("不支持的数据源类型");
        }

        return parse(typeEnum, sql);
    }

    public static SqlParseVO parse(DatasourceTypeEnum typeEnum, String sql) {
        if (typeEnum == DatasourceTypeEnum.PRESTO) {
            if (StringUtils.isNotEmpty(sql)) {
                sql = sql.replaceAll("`", "\"");
            }
            return PrestolHelper.parseSql(sql);
        } else if (typeEnum == DatasourceTypeEnum.SPARK_SQL) {
            return SparkSqlHelper.parseSql(sql);
        } else if (typeEnum == DatasourceTypeEnum.STARROCKS) {
            return StarRockslHelper.parseSql(sql);
        } else {
            throw new BizException("不支持的数据源类型");
        }
    }

    public static void main(String[] args) {
        String sql = " create table `dwd`.`dqc_test_partition`(\n" +
                "  `id` BIGINT comment '中文',\n" +
                "  `name` ARRAY<BIGINT>,\n" +
                "  `status` ARRAY<TIMESTAMP>,\n" +
                "  `amount` BIGINT) \n" +
                "comment '数据质量分区表' \n" +
                "partitioned by (\n" +
                "  `bizdate` STRING comment '1') \n" +
                "stored as orc\n ";

        System.out.println(SqlParseUtils.parse(DatasourceTypeEnum.SPARK_SQL, sql));
    }
}
