class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      HashMap<Character,Integer> map1=new HashMap<>();
      for(char c:magazine.toCharArray()){
        map1.put(c,map1.getOrDefault(c,0)+1);
      }
      for(char c:ransomNote.toCharArray()){
        if((map1.getOrDefault(c,0)-1)<0){
            return false;
        }
        map1.put(c,map1.getOrDefault(c,0)-1);
      }
      return true;

    }
}