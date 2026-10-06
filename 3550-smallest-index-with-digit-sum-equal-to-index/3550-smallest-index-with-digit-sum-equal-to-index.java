class Solution {
    public int smallestIndex(int[] nums) {
        int small = Integer.MAX_VALUE;
        boolean found = false;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(num == i && num < 10){
                if(num < small){
                    small = num;
                    found = true;
                }
            }
            else if(num > 9){
                int sum = 0;
                while(num > 0){
                    sum += num % 10;
                    num /= 10;
                }
                if(sum == i && sum < small){
                    small = i;
                    found = true;
                }
            }
        }
        if(!found){
            return -1;
        }
        return small;
    }
}