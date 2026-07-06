class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int x : nums2){
            al.add(x);
        }
        for(int i=0;i<nums1.length;i++){
            if(al.contains(nums1[i])){
                hs.add(nums1[i]);
            }
        }
        return hs.stream()
                 .mapToInt(Integer::intValue)
                 .toArray();
    }
}