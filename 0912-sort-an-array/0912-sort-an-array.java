// import java.util.*;

// class Solution {
//     public int[]sortArray(int[] nums){
//        for(int i=0;i<nums.length-1;i++){
//         for(int j=0;j<nums.length-1;j++){
//             if(nums[j]>nums[j+1]){
//                int temp=nums[j+1];
//                nums[j+1]=nums[j];
//                nums[j]=temp;
//             }
//         }
//        }
//        return nums;            
//     }
// }


// class Solution {
//     public int[] sortArray(int[] nums) {
//         for (int i = 0; i < nums.length - 1; i++) {
//             boolean swapped = false;
//             for (int j = 0; j < nums.length - 1 - i; j++) { 
//                 if (nums[j] > nums[j + 1]) {
//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                     swapped = true;
//                 }
//             }
//             if (!swapped) break;
//         }
//         return nums;
//     }
// }

class Solution {
    public int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }
    }
