package mySqlSystem;

public class 索引篇 {
}
/**
 *      先说索引是什么？
 *          以指定的字段构成的数据结构
 *          索引的存在就是为了提高查找效率
 *      索引都有哪些类型？
 *          1.哈希表
 *          2.有序数组
 *          3.搜索树
 *      索引都有哪些种类？
*           1.主键索引 primary（聚簇索引）
*           2.唯一索引 unique
*           3.普通索引 key index
 *          4.组合索引 index（1,2,3）
 *      索引的数据结构是B+树：
 *          假设规定每个节点最多M个子节点
 *              B树  每个节点一定有2个子节点 平衡树
 *              B-树 每个节点有M/2 到 M个子节点
 *              B+树 在B-树的基础上 对叶子节点加了指针 也就是一定在叶子节点命中
 *      当使用InnoDB引擎的时候：
 *          首先有主键会根据主键建立一棵B+树
 *          没主键也会给你默认给你建立主键 只是你看不见而已
 *          当添加普通索引的时候 也会建立一棵B+树 但是叶子节点命中的值不是最终的数据
 *          而是主键，拿到主键后然后去主键B+树中搜索 这个操作叫做‘回表’
 *          以上的过程会引发几个问题！
 *              1.因为回表操作 如果主键失效 那么所有的普通索引通通失效
 *              2.在运行的过程中需要动态的维护B+树，所以尽量不要造成逻辑裂缝
 *                比如id有 1235 现在插入4 之前的已经按从大到小的逻辑构建好树
 *                插入的4就会破坏树的结构，我们此时就需要进行维护。
 *              3.我们应该注意到的是 所有的B+树都会涉及到主键的存储，也就是主键
 *                长度越小越能节约我们的存储空间
 *              4.同时我们也应该注意到 每次不得不回表操作 因为数据在主键所在的B+树
 *      索引的优化：
 *          1.覆盖索引
 *              想法很简单 如果我要找的数据 直接就在叶子节点中 我们就不用回表了
 *              直接返回结果就好了
 *          2.联合索引
 *              基于覆盖索引的思想，如果要拿的数据和判定条件都在树上，那么我们就可以
 *              直接剪枝和拿数据。
 *              最左前缀：
 *                  索引是有顺序的，优化器会帮助我们优化where 后面的字段顺序
 *                  尽可能的使用索引，如果采用索引的话则会从最左边一次查找
 *              索引下推：
 *                  这一这个功能是5.6版本后引进的，直接在索引树上进行剪枝
 *              需要注意的是：
 *                  1.多个索引在一起如何安排顺序？
 *                      索引的复用能力，a b 索引 你经常用a 那么（a，b）
 *                  2.空间上的考虑
 *                      a b 索引 b的字段长度大于a 那么 我们就可以（b, a）和a
 *
 *
 *
 * */