package com.zheng.sparksql;

import java.io.IOException;
import java.util.List;

/**
 * Created by zheng on 2020/9/8
 */
public class Test {
    public static void main(String[] args) throws IOException {
        SqlParser builder = new SqlParser();
        String sql = "select a.id,a.name,b.age as age1,sum(b.sex),avg(b.age) avg_age from person a left join person_info b on a.id=b.id " +
                "where b.age>18 limit 3";
        //获取select的字段和别名
        List list = (List) builder.getNameExpression(sql);
        System.out.println(list);
    }
}
