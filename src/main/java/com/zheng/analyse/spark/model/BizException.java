package com.zheng.analyse.spark.model;

public class BizException extends RuntimeException {
    private String message;

    public BizException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
