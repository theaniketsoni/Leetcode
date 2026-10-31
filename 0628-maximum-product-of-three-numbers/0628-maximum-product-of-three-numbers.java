class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length == 3){
            return nums[0]*nums[1]*nums[2];
        }
        int max = -10000;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = nums.length-3; i<nums.length; i++){
            max = Math.max(nums[i] * nums[(i+1)%n] * nums[(i+2)%n], max);
        }
        return max;

    }
}