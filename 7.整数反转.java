/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 *
 * https://leetcode-cn.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (32.52%)
 * Likes:    1104
 * Dislikes: 0
 * Total Accepted:    137.9K
 * Total Submissions: 423.8K
 * Testcase Example:  '123'
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 
 * 示例 1:
 * 
 * 输入: 123 
 * 输出: 321
 * 
 * 
 * 示例 2:
 * 
 * 输入: -123
 * 输出: -321
 * 
 * 
 * 示例 3:
 * 
 * 输入: 120
 * 输出: 21
 * 
 * 
 * 注意:
 * 
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回
 * 0。
 * 
 */
class Solution {
    public int reverse(int x) {
        int sum = 0;
        int a = 0, b = 0;
        while(x!=0) {
            b = x % 10;
            if(sum>Integer.MAX_VALUE/10||(sum==Integer.MAX_VALUE/10&&b>Integer.MAX_VALUE%10)){
                return 0;
            }else if(sum<Integer.MIN_VALUE/10||(sum==Integer.MIN_VALUE/10&&b<Integer.MIN_VALUE%10) ){
                return 0;
            }
            a = sum * 10;
            sum = a + b;  
            // System.out.print(x+"^^^");
            x = x/10;
        }
        return sum;
    }
}

