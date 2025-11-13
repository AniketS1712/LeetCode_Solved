class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].isEmpty() ||arr[i].equals(".")) {
                continue;
            } else if(arr[i].equals("..")) {
                if(!stack.isEmpty()) stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }

        StringBuilder result = new StringBuilder();
        for(String dir : stack) {
            result.append('/').append(dir);
        }
        return result.length() == 0 ? "/" : result.toString();
    }
}
