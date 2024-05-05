//https://leetcode.com/problems/daily-temperatures/description/
package DSA.Stack;

import java.util.Stack;

class Solution {
    int[] arr;
    Stack<Integer> span = new Stack<>();
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[temperatures.length];
        int n = temperatures.length-1;
        for(int i=n;i>=0;i--){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                arr[i] = 0;
            }
            else{
                arr[i] = i-temperatures[stack.peek()] ;
            }
            stack.push(i);
        }
        return arr;
    }
}
public class DailyTemperatures {
    public static void main(String[] args) {

    }

}
