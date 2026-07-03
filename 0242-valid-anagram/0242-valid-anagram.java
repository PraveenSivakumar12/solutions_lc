class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        HashMap<Character,Integer> hs1 = new HashMap<>();
        for(char ch : arr1){
            hs1.put(ch,hs1.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> hs2 = new HashMap<>();
        for(char ch : arr2){
            hs2.put(ch,hs2.getOrDefault(ch,0)+1);
        }
        boolean equal = hs1.equals(hs2);
        return equal;
    }
}