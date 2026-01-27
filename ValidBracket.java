import java.util.Stack;

class Solution {
    public boolean isValid(String s1) {
        Stack<Character> stack = new Stack<>();
        char[] s = s1.toCharArray();
        int i = 0;

        while (i < s.length) {
            if (s[i] == '(') {
                stack.push(')');
            } else if (s[i] == '[') {
                stack.push(']');
            } else if (s[i] == '{') {
                stack.push('}');
            } else {
                if (stack.isEmpty() || s[i] != stack.pop()) {
                    return false;
                }
            }
            i++;
        }
        return stack.isEmpty();
    }
}
