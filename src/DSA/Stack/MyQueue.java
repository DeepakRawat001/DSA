package DSA.Stack;

import java.util.Stack;

class MyQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    int peekElement = -1;


    public MyQueue() {

    }

    public void push(int x) {
        if(input.isEmpty()){
            peekElement = x;
        }
        input.push(x);
    }

    public int pop() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
        return output.pop();
    }

    public int peek() {
        if(output.isEmpty()){
            return peekElement;
        }
        else{
            return output.peek();
        }
    }

    public boolean empty() {
        if(output.isEmpty()&& input.isEmpty())return true;
        return false;
    }
}