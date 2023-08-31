package com.zheng.analyse.spark.model;

public enum SqlTypeEnum {
    CREATE_TABLE,
    CREATE_TABLE_AS_SELECT,
    CREATE_TABLE_AS_LIKE,
    DROP_TABLE,
    ADD_COLUMN,
    ALTER_COLUMN,

    //DML
//    QUERY,
    SELECT,
    //    DELETE,
//    UPDATE,
    INSERT_VALUES,
    INSERT_SELECT,

    TRUNCATE_TABLE,
//    MULTI_INSERT,

    SHOW_CATALOGS,
    SHOW_SCHEMAS,
    SHOW_TABLES,
    SHOW_COLUMNS,
    SHOW_CREATE_VIEW,
    SHOW_CREATE_TABLE,
    UNKOWN;

    SqlTypeEnum() {
    }


}
