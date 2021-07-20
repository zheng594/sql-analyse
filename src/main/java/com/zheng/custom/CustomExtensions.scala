package com.zheng.custom

import org.apache.spark.sql.SparkSessionExtensions

class CustomExtensions  extends (SparkSessionExtensions => Unit) {
    override def apply(v1: SparkSessionExtensions): Unit = ???
}
