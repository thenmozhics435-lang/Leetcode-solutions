class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int maxLength=0;
        int [] lastseen=new int[128];
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            left=Math.max(left,lastseen[ch]);
            maxLength=Math.max(maxLength,right-left+1);
            lastseen[ch]=right+1;
        }
        return maxLength;
    }
}
       