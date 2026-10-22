class Solution {
    public void rotate(int[] nums, int k) {
        int st = 0; 
        int end = nums.length-1;

        while(st<end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
        int l = 0;
        if(k>nums.length){
            k = k%nums.length;
        }
        int r = k-1;
        while(l<r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        int lp = k;
        int rp = nums.length-1;
        while(lp < rp){
            int temp = nums[lp];
            nums[lp] = nums[rp];
            nums[rp] = temp;
            lp++;
            rp--;
        }
        
        
    }
}