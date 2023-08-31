package com.zheng.analyse;

import java.util.HashMap;
import java.util.Map;

public enum DatasourceTypeEnum {
    PRESTO("presto"),
    STARROCKS("starrocks"),
    SPARK_SQL("spark_sql");

    private String type;
    public static final Map<String, DatasourceTypeEnum> MAP = new HashMap<>();

    static {
        for (DatasourceTypeEnum typeEnum : values()) {
            MAP.put(typeEnum.getType(), typeEnum);
        }
    }
    DatasourceTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
