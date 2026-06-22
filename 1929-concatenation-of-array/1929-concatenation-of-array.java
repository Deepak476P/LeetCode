class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for(int i = 0; i < 2; i++){
            int k = 0;
            for(int j = n * i; j < n * (i + 1); j++){
                ans[j] = nums[k];
                k++;
            }
        }

        return ans;
    }
}