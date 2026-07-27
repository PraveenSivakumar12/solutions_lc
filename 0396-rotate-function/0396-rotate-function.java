class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;

        long totalSum = 0;
        long rotateSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
            rotateSum += (long) i * nums[i];
        }

        long max = rotateSum;

        for (int i = n - 1; i > 0; i--) {
            rotateSum = rotateSum + totalSum - (long) n * nums[i];
            max = Math.max(max, rotateSum);
        }

        return (int) max;
    }
}