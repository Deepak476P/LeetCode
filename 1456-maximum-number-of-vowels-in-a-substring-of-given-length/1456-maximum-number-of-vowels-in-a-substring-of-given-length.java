class Solution {
    public int maxVowels(String s, int k) {
        int low=0;
        int count=0;
        for(int i=0;i<k;i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        int ans=count;
        for(int i=k;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
            while((i-low+1)>k){
                char b=s.charAt(low);
                if(count>0){
                if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'){
                    count--;
                    
                }}
                else{
                    count=0;
                }
                low++;
            }
            ans=Math.max(ans,count);
        }
        return ans;
    }
}