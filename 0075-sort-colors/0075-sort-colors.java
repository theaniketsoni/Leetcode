class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int curr = 0;

        while(curr <= high){
            if(nums[curr] == 0){
                int temp = nums[low];
                nums[low] = nums[curr];
                nums[curr] = temp;
                curr++;
                low++;
            }
            else if(nums[curr] == 2){
                int temp = nums[high];
                nums[high] = nums[curr];
                nums[curr] = temp;
                high--;
            }
            else{
                curr++;
            }

        }
        

        
    }
}