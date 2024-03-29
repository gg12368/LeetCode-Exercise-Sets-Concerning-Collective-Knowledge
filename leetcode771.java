771.宝石与石头
给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
示例 1:
输入: J = “aA”, S = “aAAbbbb”
输出: 3

示例 2:
输入: J = “z”, S = “ZZ”
输出: 0

注意:
S 和 J 最多含有50个字母。J 中的字符不重复。

思路：
首先利用toCharArray函数将宝石与石头字符串转换为数组。
然后建立Set集合，遍历宝石数组，依次将宝石放入。
最后，遍历石头数组，判断石头数组中当前遍历的元素是否包含在Set集合中(利用contains()函数判断)，若在，则count++。

class Solution {
    public int numJewelsInStones(String J, String S) {
        char[] chars1=J.toCharArray();
        char[] chars2=S.toCharArray();
        //把宝石放在Set中
        Set<Character> set=new HashSet<>();
        for(char c:chars1){
            set.add(c);
        }
        int count=0;
        for(char c:chars2){
            if(set.contains(c)){
                count++;
            }
        }
        return count;
    }
}
