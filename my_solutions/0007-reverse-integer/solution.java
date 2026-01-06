class Solution {
    public int reverse(int x) {
        long rev = 0;
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x *= sign;
        }
        while ( x > 0 ) {
            int a = x % 10;
            x /= 10;
            rev = (rev * 10) + a;
        }
        rev *= sign;
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int)rev;
    }
}
