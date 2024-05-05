//https://leetcode.com/problems/online-stock-span/submissions/1245989089/
package DSA.Stack;

import java.util.Stack;

public class StockSpanner {
    Stack<Integer> prices = new Stack<>();
    Stack<Integer> spans = new Stack<>();
    public StockSpanner() {

    }

    public int next(int price) {
        int span = 1;
        while(!prices.isEmpty() && prices.peek()<=price){
            prices.pop();
            span+=spans.pop();
        }
        prices.push(price);
        spans.push(span);
        return span;

    }
}
