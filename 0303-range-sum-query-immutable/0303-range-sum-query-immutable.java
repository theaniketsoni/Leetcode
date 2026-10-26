class NumArray {
    int[] arr;
    // int[] nums;
    public NumArray(int[] nums) {

        int arr[] = new int[nums.length];
        arr[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            arr[i] = nums[i] + arr[i-1];
        }
        this.arr = arr;
        // return arr;
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return arr[right];
        }
        else{
            return arr[right] - arr[left-1];
            
        }
    
    }


}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */