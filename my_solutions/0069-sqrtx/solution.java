class Solution {
    public int mySqrt(int x) {
        // int low = 0;
        // int mid;
        // int high = x;
        // int sqr = 0;
        
        // while(low <= high) {
        //     mid = (low + high) / 2;
        //     long square = (long) mid * mid;
        //     if(square == x) return mid;
        //     else if(square <= x) {
        //         low = mid + 1;
        //         sqr = mid;
        //     } else {
        //         high = mid - 1;;
        //     }
        // }
        // return sqr;

        // Subtraction Method
        int i = 1;
        int sqr = 0;
        while(x != 0 || x < 0) {
            if(x > 0) {
                x -= i;
                i += 2;
                sqr++;
            } else if(x < 0){
                return sqr - 1;
            }
        }
        return sqr;
    }
}
