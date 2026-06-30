class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        int preprd = 1;
        int sufprd = 1;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                pre[i] = preprd;
            }
            else{
                preprd*=nums[i-1];
                pre[i] = preprd;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                suf[i] = sufprd;
            }
            else{
                sufprd*=nums[i+1];
                suf[i] = sufprd;
            } 
        }
        for(int i=0;i<n;i++){
            nums[i] = pre[i]*suf[i];
        }
        return nums;
    }
}