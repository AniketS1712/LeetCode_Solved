class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int num = 0;
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            if (candy > num) {
                num = candy;
            }
        }
        for(int candy : candies) {
            if(candy + extraCandies >= num) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
