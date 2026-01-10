class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int i = 0;
        int j = 0;
        while(i < nums.length / 2) {
            arr[j] = nums[i];
            arr[j + 1] = nums[n];
            i++;
            n++;
            j += 2;
        }
        return arr;
    }
}
