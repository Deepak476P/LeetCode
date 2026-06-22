class Solution {
    public int minElement(int[] nums) {
        int[] sum=new int[nums.length];
        int min=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]>0){
                sum[i]+=(nums[i]%10);
                nums[i]/=10;
            }

            if(sum[i]<min){
            min=sum[i];}

        }

        
        return min;
    }
}