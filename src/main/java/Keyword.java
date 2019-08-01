public class Keyword {
}
/**
 *  1. as
 *      这个关键字可以给《表》或《字段》起别名
 *      select * from tbl as t
 *      还有就是当连接语句使用
 *      create table  tbl1 as select * from tbl2;
 *      翻译过来就是 创建的表跟查询的表一模一样 包括数据
 *
 *  2. limit
 *      限制查询的条数 两种用法
 *      select * from tbl1 limit 1
 *      一个参数代表从0开始取 取1条
 *      select * from tbl2 limit 2,2
 *      两个参数代表从2开始取， 取2条
 *
 *  3. where
 *       指定表的生成条件，当出现on时 他用于临时表生成后的筛选工作
 *
 *  4. on
 *      主要是和连接搭配使用，用于生成临时表阶段
 *      select * from tab1 as t1 inner join tab2 as t2 on t1.id = t2.id
 *
 *  5. and
 *      短路与运算符
 *
 *  6. inner join
 *      内连接 查询出来的是一个乘积 左x右
 *      select * from tbl1 as t1 join tbl2 as t2 on ....
 *      select * from tbl1 as t1 inner join tbl2 as t2 on ....
 *
 *  7. left join
 *      左连接 左表全部查询 不管后面指定的条件能不能对上
 *      那对上就正常显示，不能对上就是为null
 *      select * from tbl1 as t1 left join tbl2 as t2 on .....
 *
 *  8. right join
 *      右连接 右表全部查询 不管后面指定的条件能不能对上
 *      那对上就正常显示，不能对上就是为null
 *      select * from tbl1 as t1 right join tbl2 as t2 on .....
 *
 *  9. order by
 *      指定以什么什么排序
 *      select * from tab order by one desc asc
 *
 *  10.distinct
 *      去重
 *      select count(distinct name) from tab
 *
 *  11. not in
 *      翻译过来就是不在什么什么之中
 *      select name from tab where name not in (select )
 *
 *  12. not null
 *      不为null
 *      select name from tab where name not null
 *
 *  13. not exists
 *
 *  14. explain
 *      显示mysql执行select查询语句时所用到的信息
 *      以一张表的形式返回，其中有一个重要的参数
 *      select-type 查询类型
 *      type 扫描类型 最差的是all 最好的是 const
 *      table 表名
 *      possible-key 可能用到的索引
 *      key 在查询过程真正用到的索引
 *      key-len 索引长度 越小越好
 *
 *
 *
 **/