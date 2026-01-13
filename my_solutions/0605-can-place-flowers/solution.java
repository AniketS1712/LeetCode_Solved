class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while(i < flowerbed.length) {
            if(flowerbed[i] == 0) {
                boolean left = (i == 0) || (flowerbed[i - 1] == 0);
                boolean right = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if(left && right) {
                    flowerbed[i] = 0;
                    n--;
                    if(n == 0) return true;
                    i += 2;
                    continue;
                }
            }
            i++;
        }
        return n <= 0;
    }
} 
