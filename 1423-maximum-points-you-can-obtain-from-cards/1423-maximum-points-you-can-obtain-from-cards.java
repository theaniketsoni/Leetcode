class Solution {
    public int maxScore(int[] nums, int k) {
        int sum = 0;
        int maxsum = 0;
        

        for(int i = 0; i<k; i++){
            sum += nums[i];
        }
        maxsum = sum;
        for(int i = 1; i<=k; i++){
            sum = sum - nums[k-i] + nums[nums.length-i];
            maxsum = Math.max(maxsum, sum);
        }
        return maxsum;

    }
}