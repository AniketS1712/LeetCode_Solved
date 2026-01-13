class Solution {
    public boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num / 2;
        int mid;
        int sqr = 0;

        if(num == 1) {
            return true;
        }
        
        while(low <= high) {
            mid = (low + high) / 2;
            long square = (long)mid * mid;
            if(square == num) return true;
            else if(square <= num) {
                low = mid + 1;
                sqr = mid;
            } else {
                high = mid - 1;
            }
        }
        
        if(sqr * sqr == num) {
            return true;
        }
        return false;
    }
}
