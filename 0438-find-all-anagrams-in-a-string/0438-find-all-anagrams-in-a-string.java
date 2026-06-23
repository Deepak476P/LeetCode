class Solution {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lis=new ArrayList<>();
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
        if(p.length()>s.length()){
            return lis;
        }
        else{
            for(char ch: p.toCharArray()){
                m1.put(ch,m1.getOrDefault(ch,0)+1);
            }
            int low=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                m2.put(c, m2.getOrDefault(c, 0) + 1);
                while((i-low+1)>p.length()){
                    char rem=s.charAt(low);
                    m2.put(rem, m2.get(rem) - 1);
                    if(m2.get(rem)==0){
                        m2.remove(rem);
                    }
                    
                    low++;
                }
                if(m1.equals(m2)){
                    lis.add(low);
                }

                
            }
        }
        return lis;
    }
}