class Solution {
    public int addDigits(int num) {
        while(num > 9) {
            int sum = 0;
            int num1 = num;
            while(num1 != 0) {
                int temp = num1 % 10;
                sum += temp;
                num1 /= 10;
            }
            num = sum;
        }
        return num;
    }
}
