牛客网：旧键盘问题
旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、以及实际被输入的文字，请你列出
肯定坏掉的那些键。

输入描述:
输入在2行中分别给出应该输入的文字、以及实际被输入的文字。每段文字是不超过80个字符的串，由字母A-Z（包括大、小写）、数字0-9、
以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。

输出描述:
按照发现顺序，在一行中输出坏掉的键。其中英文字母只输出大写，每个坏键只输出一次。题目保证至少有1个坏键。
示例1
输入
7_This_is_a_test
_hs_s_a_es
输出
7TI

思路：
输入两次，第一次是正常键，第二次是坏键。遍历坏键，将坏键存入Set中，再遍历正常键，倘若坏键中没有当前正常键，并且written中没有当前正常键，则将当前正常键加入written中。

import java.nio.charset.Charset;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String right=scanner.nextLine();
        String wrong=scanner.nextLine();
        
        Set<Character> set=new TreeSet<>();
        for(char c:wrong.toCharArray()){
            set.add(c);
        }
        
        Set<Character> written=new TreeSet<>();
        for(char c:right.toCharArray()){
            if(!set.contains(c)){
                c=Character.toUpperCase(c);
                if(!written.contains(c)){
                    System.out.print(c);
                    written.add(c);
                }
            }
        }
        System.out.println();
    }
}
