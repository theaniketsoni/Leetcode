class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        int l = 0;
        int h = numbers.length-1;
        while(l < h){
            if(numbers[l] + numbers[h] == target){
                arr[0] = l+1;
                arr[1] = h+1;
                return arr;
            }
            else if(numbers[l] + numbers[h] > target){
                h--;
            }
            else{
                l++;
            }

        }return arr;
        
    }
}