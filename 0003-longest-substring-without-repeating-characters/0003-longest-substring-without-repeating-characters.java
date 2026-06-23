class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();

        HashSet<Character> se =new HashSet<>();
        int max=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            while(se.contains(ch)){
                se.remove(s.charAt(left));
                left++;
            }
            se.add(ch);
            max=Math.max(max,i-left+1);
        }
        return max;   
    }
}