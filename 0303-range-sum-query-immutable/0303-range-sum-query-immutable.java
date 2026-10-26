class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
        // return arr;
    }
    
    public int sumRange(int left, int right) {
        // int arr[] = new int[nums.length];
        // arr[0] = nums[0];
        int sum = 0;
        for(int i = left; i<=right; i++){
            sum += nums[i];
        }
        return sum;
    }


}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */