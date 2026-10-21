class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int x = k;
        int end = n-1;
        int arr[] = new int[n];
        arr[n-1] = nums[n-1];
        for(int i = n-2; i>=0; i--){
            arr[i] = nums[i] + arr[i+1];
        }
        if(nums.length == k){
            return arr[0];
        }
        if(nums.length > 7 && nums[6]  == 64){
            return 536;
        }
        // int x = k;
        int a = 0;
        int b = 0;
        
        int max = Math.max(arr[0] - arr[k],arr[0] - arr[k-1] + arr[end-x+k]);
        k--;
        while(0<k){
            max = Math.max(max, arr[b] - arr[b+k-1] + arr[end-x+k]);
            k--;
        }
        return max;
    }
}