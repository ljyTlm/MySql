package delete;

public class 删除表样例 {

}
/*
    1.drop关键字
        命令格式：drop table [表名]
        直接删除 连带着数据和表结构

    2.truncate关键字
        命令格式：truncate table [表名]
        清空表数据 但是不删除表结构 有个知识点 清空后自增id会从1开始

    3.delete关键字
        命令格式：delete table [表名]
        效率极低 一行一行删除 自增id不会从1开始


 */