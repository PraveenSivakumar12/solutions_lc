class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
            s.add(nums[i]);
        }
        for(int num : s){
            if(hs.get(num)>1){
                al.add(num);
            }
        }
        return al;
    }
}