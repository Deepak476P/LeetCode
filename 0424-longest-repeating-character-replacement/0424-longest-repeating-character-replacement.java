class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();

        int low=0;
        int count=0;

        for(int i=0;i<s.length();i++){
            int maxcount=0;
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);

            for(char key: map.keySet()){
                maxcount=Math.max(maxcount,map.get(key));
            }
            while((i-low+1)-maxcount >k){
                char remove=s.charAt(low);
                map.put(remove,map.get(remove)-1);
                if(map.get(remove)==0){
                    map.remove(remove);
                }
                low++;
            }
            count = Math.max(count, i - low + 1);
            
        }
        return count;
    }
}