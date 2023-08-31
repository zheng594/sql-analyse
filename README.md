# sql-analyse
Sql语法解析
#### 目前已支持spark sql、presto、starrocks的sql解析

##### Spark SQL
###### 1、支持根据create语句获取库名、表名、字段名、字段备注、字段类型等信息
###### 2、支持根据select、with语句获取涉及到的表
###### 3、支持根据alter语句获取新增的字段名、字段类型等信息

##### Presto
###### 1、支持根据输入的sql语句判断是sql类型

##### StarRocks
###### 1、支持根据输入的select、with语句获取涉及到的库名、表名