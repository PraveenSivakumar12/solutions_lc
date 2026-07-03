class Solution {
    public int firstUniqChar(String s) {
        char[] arr = s.toCharArray();
        HashMap<Character,Integer> hs = new HashMap<>();
        for(char ch : arr){
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        }
        for(int i =0;i<s.length();i++){
            if(hs.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}