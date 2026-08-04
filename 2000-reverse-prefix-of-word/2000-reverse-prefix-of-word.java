class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuffer s = new StringBuffer();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                s.append(word.charAt(i));
                s = s.reverse();
                for(int j=i+1;j<word.length();j++){
                    s.append(word.charAt(j));
                }
                break;
            }
            else{
                s.append(word.charAt(i));
            }
        }
        return s.toString();
    }
}