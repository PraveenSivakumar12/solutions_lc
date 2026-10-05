class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<9){
                if(nums[i]<min){
                    min = nums[i];
                }
            }
            else{
                int num = nums[i];
                int sum = 0;
                while(num > 0){
                    sum += num%10;
                    num/=10;
                }
                if(sum < min){
                    min = sum;
                }
            }
        }
        return min;
    }
}