package delete;

public class 删除库样例 {
}
/*
    1.drop关键字
        命令格式：drop database [数据库名]
        直接删除数据库
    2.复合语句 清空数据库所有表
    SELECT concat('DROP TABLE IF EXISTS ', table_name, ';')
    FROM information_schema.tables
    WHERE table_schema = 'mydb';


 */