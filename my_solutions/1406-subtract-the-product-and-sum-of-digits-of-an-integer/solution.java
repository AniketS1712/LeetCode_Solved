class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int diff;
        while(n > 0) {
            int a = n % 10;
            product *= a;
            sum += a;
            n /= 10;
        }
        diff = product - sum;
        return diff;
    }
}
