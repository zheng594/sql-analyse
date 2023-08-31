package com.zheng.analyse.spark.model;

public class ColunmObj {
    private String name;
    private String alias; //查询语句别名
    private String oldName; //修改字段语句，旧名字
    private String dataType;
    private String comment;
    private boolean isPartition;

    public ColunmObj() {
    }

    public ColunmObj(String name, String alias) {
        this.alias = alias;
        this.name = name;
    }

    public ColunmObj(String oldName, String name, String dataType, String comment, boolean isPartition) {
        this.oldName = oldName;
        this.name = name;
        this.dataType = dataType;
        this.comment = comment;
        this.isPartition = isPartition;
    }

    public ColunmObj(String name, String dataType, String comment, boolean isPartition) {
        this.name = name;
        this.dataType = dataType;
        this.comment = comment;
        this.isPartition = isPartition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public boolean isPartition() {
        return isPartition;
    }

    public void setPartition(boolean partition) {
        isPartition = partition;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
