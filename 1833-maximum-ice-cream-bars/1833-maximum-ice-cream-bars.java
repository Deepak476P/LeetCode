class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=costs[0];
        if(costs[0]>coins){
            return 0;
        }
        else if(costs[0]==coins){
            return 1;
        }
        else{
            for(int i=1;i<costs.length;i++){
                sum+=costs[i];
                if(sum>coins){
                    return i;
                }
                else if(sum==coins){
                    return i+1;
                }
            }
        }
         return costs.length; 
    }
}