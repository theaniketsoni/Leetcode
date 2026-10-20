class Solution {
    public int[] sumZero(int n) {
        int nums[] = new int[n];
        int st = 0;
        int end = n-1;
        int m1 = -(n/2);
        int m2 = n/2;

        while(st<end){
            nums[st] = m1++;
            nums[end] = m2--;
            st++;
            end--;
        }
        return nums;

        
        
    }
}