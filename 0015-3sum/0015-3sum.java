class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        
        Arrays.sort(nums);
        // [-4, -1, -1, 0, 1, 2];
        // [[-1, -1, 2], [-1, 0, 1]];
        int l = 1;
        // int c = 2;
        int h = nums.length-1;

        for(int i = 0; i<nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            h = nums.length-1;
            l = i+1;
            while(l<h){
                int sum = nums[i] + nums[l] + nums[h];
                if(nums[i] + nums[l] + nums[h] < 0){
                    l++;
                }
                else if(nums[i] + nums[l] + nums[h] > 0){
                    h--;
                }

                else{
                    List<Integer> ilist = new ArrayList<>();
                    ilist.add(nums[i]);
                    ilist.add(nums[l]);
                    ilist.add(nums[h]);
                    
                    list.add(ilist);
                    l++;
                    h--;

                    while (l < h && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < h && nums[h] == nums[h + 1]) {
                        h--;
                    }
                }
                
            }
        }
        return list;

    }
}