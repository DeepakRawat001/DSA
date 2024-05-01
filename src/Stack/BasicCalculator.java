package Stack;

import java.util.Stack;

public class BasicCalculator {
    public int calculate(String s) {
        int result = 0,number =0;
        int sign = 1;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            Character ch = s.charAt(i);
            if(Character.isDigit(ch)){
                number = number * 10 + ch-'0';
            }
            else if(ch == '+'){
                result += number*sign;
                number = 0;
                sign = 1;
            }
            else if(ch == '-'){
                result += number*sign;
                number = 0;
                sign = -1;
            }
            else if(ch == '('){
                stack.push(result);
                stack.push(sign);
                result =0;
                number = 0;
                sign = 1;
            }
            else if(ch == ')'){
                result += number*sign;
                number = 0;
                int stack_sign = stack.pop();
                int last_result = stack.pop();
                result *= stack_sign;
                result += last_result;
            }
        }
        result += number*sign;
        return result;
    }

    public static void main(String[] args) {
        String s = "1-1";
        BasicCalculator obj = new BasicCalculator();
        System.out.println(obj.calculate(s));
    }
}
