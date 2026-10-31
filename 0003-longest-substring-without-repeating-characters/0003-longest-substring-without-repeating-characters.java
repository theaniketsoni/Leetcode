class Solution {
    public int lengthOfLongestSubstring(String s) {
        // HashSet<Character> set = new HashSet<>();
        int count = 0;
        int max = 0;
        int j = 0;

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            HashSet<Character> set = new HashSet<>();
            j = i;
            char ch1 = s.charAt(j);
            while(j<s.length() && !set.contains(s.charAt(j))){
                ch1 = s.charAt(j);
                set.add(ch1);
                count++;
                max = Math.max(max, count);
                // ch1 = s.charAt(j);
                j++;
            }
            count = 0;
        }
        return max;
        
    }
}