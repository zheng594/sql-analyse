package com.zheng.analyse.spark.model;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SqlParseVO {
    private SqlTypeEnum sqlType;
    private List<TableObj> inputTables = new ArrayList<>();
    private TableObj outputTable;
    private Set<ColunmObj> inputColList = new LinkedHashSet<>();
    private List<ColunmObj> inputFullColList = new ArrayList<>();
    private boolean isLimit;

    public List<TableObj> getInputTables() {
        return inputTables;
    }

    public void setInputTables(List<TableObj> inputTables) {
        this.inputTables = inputTables;
    }

    public TableObj getOutputTable() {
        return outputTable;
    }

    public void setOutputTable(TableObj outputTable) {
        this.outputTable = outputTable;
    }

    public SqlTypeEnum getSqlType() {
        return sqlType;
    }

    public void setSqlType(SqlTypeEnum sqlType) {
        this.sqlType = sqlType;
    }

    public Set<ColunmObj> getInputColList() {
        return inputColList;
    }

    public void setInputColList(Set<ColunmObj> inputColList) {
        this.inputColList = inputColList;
    }

    public List<ColunmObj> getInputFullColList() {
        return inputFullColList;
    }

    public void setInputFullColList(List<ColunmObj> inputFullColList) {
        this.inputFullColList = inputFullColList;
    }

    public boolean isLimit() {
        return isLimit;
    }

    public void setLimit(boolean limit) {
        isLimit = limit;
    }

    @Override
    public String toString() {
        return "TableSib{" +
                "sqlType=" + sqlType +
                ", inputTables=" + inputTables +
                ", outputTable=" + outputTable +
                '}';
    }

}
