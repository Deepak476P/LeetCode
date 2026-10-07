class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map1.put(c,i);
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(map2.get(c)==1){
                return map1.get(c);
            }
        }
        return -1;

    }
}