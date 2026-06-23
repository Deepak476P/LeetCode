class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int min=bloomDay[0];
        int max=bloomDay[0];
        for(int i=1;i<bloomDay.length;i++){
            min=Math.min(min,bloomDay[i]);
            max=Math.max(max,bloomDay[i]);
        }
        int low=min;
        int high=max;

       if((long)k*m>bloomDay.length){
         return -1;
       } 
       else if((long)m*k==bloomDay.length){
        return max;
       }
       else{
         while(low<high){
            int mid=(low+high)/2;
            if(canthey(min,mid,m,k,bloomDay)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        } 
        return low;
       } 

    }

    public boolean canthey(int min,int days,int m,int k,int[] bloomDay){
        if(min>days){
            return false;
        }
        else{
            int count=0;
            int c=0;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=days){
                    count++;
                    if(count==k){
                        c++;
                        count=0;
                    }
                }
                else{
                    count=0;
                }
            }
            if(c >= m){
                return true;
            }
            else{
                return false;
            }

        }

    }
}