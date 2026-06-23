class Solution {

    public int smallestDivisor(int[] nums, int threshold) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int low=1;
        int high=max;

        while(low<high){
            int mid=(low+high)/2;
            if(valueof(nums,mid)<=threshold){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }

    public int valueof(int[] nums,int can){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=can){
                sum+=1;
            }
            else if(nums[i]%can==0){
                sum+=(nums[i]/can);
            }
            else{
                sum+=(nums[i]/can)+1;
            }
        }
        return sum;
    }
}