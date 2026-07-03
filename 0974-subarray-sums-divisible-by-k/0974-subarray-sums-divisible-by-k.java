import java.util.*;
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,1);
        int ps = 0;
        int count = 0;
        for(int num : nums){
            ps += num;
            int remain =((ps%k)+k)%k;
            if(hs.containsKey(remain)){
                count += hs.get(remain);
            }
            hs.put(remain,hs.getOrDefault(remain,0) +1);
        }
        return count;
    }
}