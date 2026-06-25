class Solution {
    public boolean isPalindrome(String s) {
        int low=0;
        int high=s.length()-1;

        while(low<high){
            char c1=Character.toLowerCase(s.charAt(low));
            char c2=Character.toLowerCase(s.charAt(high));
            if(!Character.isLetterOrDigit(c1)){
                low++;
            }
            else if(!Character.isLetterOrDigit(c2)){
                high--;
            }
            else{
                if(c1==c2){
                    low++;
                    high--;
                }
                else{
                    return false;
                }
            }
            
        }
        return true;
    }
}