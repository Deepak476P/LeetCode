class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low=0;
        long min=time[0];
        for(int i=0;i<time.length;i++){
            min=Math.min(min,time[i]);
        }
        long high=(long)min*totalTrips;
        while(low<high){
            long mid=(low+high)/2;
            if(valueof(time,mid)>=totalTrips){
                high=mid;
            }
            else{
                low=mid+1;
            }

        }
        
        return low;
    }

    public long valueof(int[] time,long ti){
        long sum=0;
        if(ti>0){
        for(int i=0;i<time.length;i++){
            sum+=(ti/time[i]);
        }
        return sum;
        }
        else{
            return 0;
        }

    }

}