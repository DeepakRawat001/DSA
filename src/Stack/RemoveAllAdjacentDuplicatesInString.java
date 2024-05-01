package Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String s) {
        StringBuilder result= new StringBuilder("");
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && s.charAt(i) ==stack.peek()){
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return  result.toString();
    }
    public static void main(String[] args) {
        String s = "azxxzy";
        RemoveAllAdjacentDuplicatesInString s1 = new RemoveAllAdjacentDuplicatesInString();
        System.out.println(s1.removeDuplicates(s));
    }
}
