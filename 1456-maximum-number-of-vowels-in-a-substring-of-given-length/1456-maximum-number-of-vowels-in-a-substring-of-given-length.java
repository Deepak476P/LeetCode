class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;

        for(int i = 0; i < k; i++) {
            char c = s.charAt(i);

            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                count++;
        }

        int ans = count;

        for(int i = k; i < s.length(); i++) {

            char enter = s.charAt(i);
            char leave = s.charAt(i-k);

            if(enter=='a'||enter=='e'||enter=='i'||enter=='o'||enter=='u')
                count++;

            if(leave=='a'||leave=='e'||leave=='i'||leave=='o'||leave=='u')
                count--;

            ans = Math.max(ans, count);
        }

        return ans;
    }
}