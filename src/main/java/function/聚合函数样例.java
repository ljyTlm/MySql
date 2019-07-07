package function;

public class 聚合函数样例 {
}
/*
    1.求平均值avg()
        select avg([字段]) from [表名] group by [字段]

        SELECT productline,
           AVG(buyprice) 'Avarage Price'
        FROM products
        GROUP BY productline;

    2.求行数count()
        select count([字段]) from [表名] group by [字段]

        SELECT productline, count(*) FROM products GROUP BY productline;

        SELECT COUNT(IF(status='Cancelled',1, NULL)) 'Cancelled',
               COUNT(IF(status='On Hold',1, NULL)) 'On Hold',
               COUNT(IF(status='Disputed',1, NULL)) 'Disputed'
        FROM orders;



 */