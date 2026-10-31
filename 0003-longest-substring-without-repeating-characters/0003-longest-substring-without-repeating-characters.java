class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int len = 0;
        int maxlen = 0;
        // int r = 0;

        for(int r = 0; r<s.length(); r++){
            char ch = s.charAt(r);
            
            if(!map.containsKey(ch)){
                map.put(ch, r);
                
                
            }
            else{
                l = Math.max(map.get(ch)+1, l);
                map.put(ch, r);
            }
            len = r-l+1;
            maxlen = Math.max(len, maxlen);

        }
        return maxlen;
    }
}