class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
        nums[i]*=nums[i];

        int low=0;
        int high=nums.length;

        while(low<high){
            for(int i=low;i<high;i++){
                if(nums[i]<nums[low]){
                    int temp=nums[low];
                    nums[low]=nums[i];
                    nums[i]=temp;
                 }
            }
            low++;
        }

        return nums;
    }
}