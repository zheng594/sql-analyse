package com.zheng.analyse.spark.model;

import java.util.List;

public class TableObj {
    private String db;
    private String tableName;
    private String comment;
    private boolean isPartition;
    private String tableFormat; //orc,parquet
    private List<ColunmObj> colList;

    public TableObj(String db,String tableName) {
        this.db = db;
        this.tableName = tableName;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<ColunmObj> getColList() {
        return colList;
    }

    public void setColList(List<ColunmObj> colList) {
        this.colList = colList;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isPartition() {
        return isPartition;
    }

    public void setPartition(boolean partition) {
        isPartition = partition;
    }

    public String getTableFormat() {
        return tableFormat;
    }

    public void setTableFormat(String tableFormat) {
        this.tableFormat = tableFormat;
    }

    @Override
    public String toString() {
        return "TableObj{" +
                "db='" + db + '\'' +
                ", tableName='" + tableName + '\'' +
                ", colList=" + colList +
                '}';
    }
}
