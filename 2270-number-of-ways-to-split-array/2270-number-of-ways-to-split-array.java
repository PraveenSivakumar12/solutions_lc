class Solution {
    public int waysToSplitArray(int[] nums) {
        long total = 0;
        for(int num:nums){
            total+= num ;
        }
        long sum = 0;
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            sum+=nums[i];
            long a = total - sum;
            if(sum>=a){
                count++;
            }
        }
        return count;
    }
}