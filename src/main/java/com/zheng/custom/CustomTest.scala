package com.zheng.custom

import org.apache.spark.sql.catalyst.parser.ParserInterface
import org.apache.spark.sql.{SparkSession, SparkSessionExtensions}

object CustomTest {

    def getSpark(): SparkSession = {
        type ParserBuilder = (SparkSession, ParserInterface) => ParserInterface
        type ExtensionsBuilder = SparkSessionExtensions => Unit
        val parserBuilder: ParserBuilder = (_, parser) => new CustomParser(parser)
        val extBuilder: ExtensionsBuilder = { e => e.injectParser(parserBuilder) }

        SparkSession
            .builder()
            .appName("SparkSql")
            .config("spark.master", "local[1]")
            .withExtensions(extBuilder)
            .getOrCreate()
    }

    def main(args: Array[String]): Unit = {
        val spark = getSpark()

        //        spark.sql("select * from person limit 3")
        spark.sql("select a.id,a.name,b.age as age1,sum(b.sex),avg(b.age) avg_age from person a left join person_info b on a.id=b.id " +
            "where b.age>18 limit 3")
    }

}
