class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int numsSum = 0;
        int sum = 0;

        for(int i = 0; i <= size - 1; i++) {
            sum += (i + 1);
            numsSum += nums[i];
        }
        return sum - numsSum;
    }
}
