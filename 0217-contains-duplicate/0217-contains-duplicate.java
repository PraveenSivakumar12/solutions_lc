class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int num : nums){
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
        boolean duplicate = hs.values().stream().anyMatch(val -> val >= 2);
        return duplicate;
    }
}