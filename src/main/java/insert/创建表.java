package insert;

public class 创建表 {
}
/*
    1.create关键字
        命令格式：create table [表名] (
            [字段名] [参数1] [参数2] [参数3],
            PRIMARY KEY([字段名])
        )
        创建表结构 指定主键 下面是样例
        create table tutorials_tbl(
           tutorial_id     INT          NOT NULL  AUTO_INCREMENT,
           tutorial_title  VARCHAR(100) NOT NULL,
           tutorial_author VARCHAR(40)  NOT NULL,
           submission_date DATE,
           PRIMARY KEY ( tutorial_id )
        )
        AUTO_INCREMENT指定自动增长 默认从1开始

        复制表结构：create table [表名] like [表名]
*/