package select;

public class 模糊查询 {
}
/*
    1.基础的like关键字的应用
        命令格式： select * from [表名] where [字段名] like "%[模糊词]%" [and[or]]
        查询规则：
                %a%：包含a的记录
                %a ：以a结尾的记录
                a% ：以a开头的记录
                _a_：三位中间是a的记录
                a_ ：两位开头是a的记录
                _a ：两位结尾是a的记录
                [a]：括号内所列字符任意一个
                [^]：除了括号中字符
                [[%]]：特殊字符查询时得用[]方括号括起来




 */