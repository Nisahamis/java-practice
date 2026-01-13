package algorithms;

import java.util.Scanner;
import java.util.Stack;

/*
Input:
- a string containing brackets: (), [], {}

Output:
- Valid  (if brackets are balanced)
- Invalid  (if brackets are not balanced)

Example:
Input:  ()[]{}
Output: Valid
*/
public class A20_ValidParentheses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter brackets string: ");
        String s = input.nextLine();

        Stack<Character> stack = new Stack<>();
        boolean valid = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    valid = false;
                    break;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') valid = false;
                if (ch == ']' && top != '[') valid = false;
                if (ch == '}' && top != '{') valid = false;

                if (!valid) break;
            }
        }

        if (!stack.isEmpty()) valid = false;

        if (valid) {
            System.out.println("Valid!");
        } else {
            System.out.println("Invalid!");
        }
    }
}
