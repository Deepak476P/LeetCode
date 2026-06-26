class Solution {
    public boolean isPalindrome(int x) {
        int bef=x;
        int ans=0;
        while(bef>=1){
            ans=ans*10+bef%10;
            bef/=10;
        }
        if(ans==x){
            return true;
        }
        return false;
    }
}