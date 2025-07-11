package com.array.programs;

import java.util.Scanner;
import java.util.Stack;

class PostfixExpression {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int val = postfixExpression(exp);
        System.out.println(val);
    }

    static int postfixExpression(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = exp.split(" ");
        
        for (String token : tokens) {
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int val2 = stack.pop();
                int val1 = stack.pop();
                
                switch (token) {
                    case "+": stack.push(val1 + val2); break;
                    case "-": stack.push(val1 - val2); break;
                    case "*": stack.push(val1 * val2); break;
                }
            }
        }
        
        return stack.pop();
    }
}