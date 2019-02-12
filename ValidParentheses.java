class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        if (s == null) {
            return false;
        }
        
        int len = s.length();
        
        if (len % 2 != 0) {
            return false;
        }
        
        char c;
        
        for (int i = 0; i < len; i++) {
            c = s.charAt(i);
            switch (c) {
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;
                default:
                    stack.push(c);
            }
        }
        
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
