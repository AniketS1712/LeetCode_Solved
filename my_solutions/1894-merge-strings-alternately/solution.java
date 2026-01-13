class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int n1 = word1.length();
        int n2 = word2.length();
        int n = Math.min(n1,n2);
        for(int i = 0; i < n; i++) {
            str.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if(n1 > n) {
            str.append(word1.substring(n));
        } else if(n2 > n) {
            str.append(word2.substring(n));
        }
        return str.toString();
    }
}
