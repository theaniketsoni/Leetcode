class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int cons = 0;
        if(nums.length == 1){
            return 1;
        }
        for(int i = 1; i<nums.length; i++){
            if(nums[i-1]+1 == nums[i]){
                count++;
                // if(count > cons){
                //     cons = count;
                // }
            }
            // else if(nums[i-1] == nums[i]){
            //     cons = count;
            // }
            else if(nums[i] != nums[i-1] && nums[i-1]+1 != nums[i]){
                count = 1;
            }
            if(count > cons){
                cons = count;
            }
            
        }
        return cons;
    }
}