package insert;

public class 创建索引样例 {
}
/**
 *      1.alter关键字  + add 关键字
 *          命令格式：alter table [tab_name] add [key_type] [index_name] (column_name)
 *          样例：
 *              添加主键索引：
 *                  alter table tab add primary id(id)
 *              添加唯一索引：
 *                  alter table tab add unique ind(index_key)
 *              添加普通索引
 *                  alter table tab add index p(name)
 *              添加联合索引
 *                  alter table tab add key p (name, age, score)
 * */