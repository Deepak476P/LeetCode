class Solution {
    public int maxArea(int[] height) {
        int low=0;
        int high=height.length-1;
        int maxvol=0;
        while(low<high){
            int vol=(high-low)*Math.min(height[low],height[high]);
            maxvol=Math.max(vol,maxvol);
            if(height[low]>height[high]){
                high--;
            }
            else{
                low++;
            }
        }
        return maxvol;
    }
}