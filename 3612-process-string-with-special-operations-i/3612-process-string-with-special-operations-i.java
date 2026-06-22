class Solution {
    public String processStr(String s) {

        String result="";
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z'){
                result+=ch;
            }
            else if(ch=='*'){
                if(result.length()>0){
                result=result.substring(0,result.length()-1);}
            }
            else if(ch=='#'){
                result+=result;
            }
            else if (ch=='%'){
                int left=0;
                int right=result.length()-1;
                char[] arr=result.toCharArray();
                while(left<right){
                    char temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;
                }
                result = String.valueOf(arr);
                
            }

        }
        return result;
        
    }
}