class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] arr1 = new int[nums.length];
        int sum1 = 0;
        for(int i=0;i<nums.length;i++){
            arr1[i] = sum1;
            sum1 += nums[i];
        }
        int[] arr2 = new int[nums.length];
        int sum2 = 0;
        for(int i=nums.length-1;i>=0;i--){
            arr2[i] = sum2;
            sum2 += nums[i];
        }
        int[] differences = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum = Math.abs(arr1[i]-arr2[i]);
            differences[i] = sum;
        }
        return differences;
    }
}