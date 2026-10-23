class Solution {
    public int[] findArray(int[] nums) {
        int arr[] = new int[nums.length];
        arr[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            arr[i] = nums[i-1] ^ nums[i];
        }
        return arr;

    }
}