class Solution {
    public int series(int n) {
        int a = 0, b = 1, result = 1;
        for(int i = 0; i < n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    } 

    public int fib(int n) {
        if(n < 1) return 0;
        return series(n - 1);
    }
}
