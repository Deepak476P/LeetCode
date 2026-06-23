class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        if(s1.length()>s2.length()){
            return false;
        }   
        else{
            for(char ch:s1.toCharArray()){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            int low=0;
            for(int i=0;i<s2.length();i++){
                char ch=s2.charAt(i);
                window.put(ch,window.getOrDefault(ch,0)+1);
                while((i-low+1)>s1.length()){
                    char c1=s2.charAt(low);
                    window.put(s2.charAt(low),window.get(s2.charAt(low))-1);
                    if(window.get(s2.charAt(low))==0){
                        window.remove(s2.charAt(low));
                    }
                    low++;
                }
                if(window.equals(map)){
                    return true;
                }
            }

        }
        return false;
    }
}