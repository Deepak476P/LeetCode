class Solution {
    public int[] sortedSquares(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int pos=nums.length-1;
        int[] ans=new int[nums.length];

        while(low<=high){
            int left=nums[low]*nums[low];
            int right=nums[high]*nums[high];
            if(left>right){
                ans[pos]=left;
                low++;
                
            }
            else{
                ans[pos]=right;
                high--;
            }
            pos--;
            
        }

        return ans;
    }
}