package mySqlSystem;

public class 日志篇 {
}
/**
 *      日志是什么？
 *          记录了数据库各种活动的记录
 *      日志都有哪些种类？
 *          1.错误日志     error log
 *          2.慢查询日志   slow log
 *              默认不开启 开启后可以设置阈值 将超过阈值的sql都记录下来
 *              5.1版本后 日志在数据库中以表的形式存在
 *          3.二进制日志   bin log
 *              两个作用 备份（复制）和恢复
 *          4.中继日志     relay log
 *              他存在于从服务器上，当使用start slave 会被创建出来
 *              从服务器从中继日记上读主服务器的修改
 *          5.重做日志（InnoDB独有） redo log
 *              循环写
 *      主要研究一下 bin log / redo log
 *
 *
 *
 *
 * */