class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        double max = -100000;
        int sum = 0;


        for(int i = 0; i<k; i++){
            sum += nums[i];
        }
        // sum = 8;
        avg = (double) sum/k;
        if(avg > max){
            max = avg;
        }
        for(int i = 1; i<nums.length-k+1; i++){
            sum -= nums[i-1];
            sum += nums[i+k-1];
            avg = (double) sum/k;
            if(avg > max){
                max = avg;
            }
        }
        return max;
    }
}