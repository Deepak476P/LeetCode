class Solution {
    public int[] resultArray(int[] nums) {

        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];

        int x = 0;
        int y = 0;
        arr1[x++] = nums[0];

        arr2[y++] = nums[1];

        for(int i = 2; i < nums.length; i++) {

            if(arr1[x - 1] > arr2[y - 1]) {
                arr1[x++] = nums[i];
            }
            else {
                arr2[y++] = nums[i];
            }
        }

        // Create result
        int[] result = new int[nums.length];

        int k = 0;

        for(int i = 0; i < x; i++) {
            result[k++] = arr1[i];
        }

        for(int i = 0; i < y; i++) {
            result[k++] = arr2[i];
        }

        return result;
    }
}