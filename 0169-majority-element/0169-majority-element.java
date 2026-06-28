class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums ){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=nums[0];
        for(int num:map.keySet()){
            if(map.get(num)>map.get(max)){
                max=num;
            }
        }
        return max;
    }
}