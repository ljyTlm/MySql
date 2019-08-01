package mySqlSystem;

public class 引擎篇 {
}
/**
 *      mysql的架构图
 *          连接器
 *     分析器   优化器    执行器
 *     MyISAM  InnoDB   NDB
 *
 *     1.MyISAM
 *          以前的MySql默认引擎，性能极好，但是不支持事务
 *          支持全文索引，不过需要注意的是，这个全文索引不支持中文
 *          索引的底层是B+树，表的总行数  因他不支持事务！！
 *     2.InnoDB
 *          1.支持事务
 *          2.行锁设计
 *          3.支持外键
 *     3.NDB集群存储引擎
 *          支持事务 分布式存储 缺点是网络开销大
 *
 * */