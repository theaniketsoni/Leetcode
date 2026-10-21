class Solution {
    public int maxArea(int[] nums) {
        int lp = 0;
        int rp = nums.length-1;
        int max = 0;
        int h = 0;

        while(lp < rp){
            int ht = rp - lp;
            h = Math.min(nums[lp], nums[rp]);
            int curw = h * ht;
            if(nums[lp] <= nums[rp]){
                lp++;
                max = Math.max(max, curw);
            }
            else{
                rp--;
                max = Math.max(max, curw);
            }
            
        }
        return max;
        
    }
}