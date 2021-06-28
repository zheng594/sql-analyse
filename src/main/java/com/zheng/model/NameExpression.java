package com.zheng.model;

public class NameExpression {
    private String exp;
    private String alias;

    public NameExpression() {
    }

    public NameExpression(String exp, String alias) {
        this.exp = exp;
        this.alias = alias;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
