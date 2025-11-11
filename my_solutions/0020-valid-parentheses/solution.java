class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                parentheses.push(ch);
            } else {
                if(parentheses.isEmpty()) return false;
                if((parentheses.peek() == '(' && ch == ')') ||
                (parentheses.peek() == '[' && ch == ']') ||
                (parentheses.peek() == '{' && ch == '}')) {
                    parentheses.pop();
                } else {
                    return false;
                }
            }   
        }
        return parentheses.isEmpty();
    }
}
