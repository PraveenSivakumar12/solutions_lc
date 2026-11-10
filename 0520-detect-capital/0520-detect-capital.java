class Solution {
    public boolean detectCapitalUse(String word) {
        if(word==word.toUpperCase()){
            return true;
        }
        else if(word==word.toLowerCase()){
            return true;
        }
        else{
            String st = word.substring(1,word.length());
            if((word.charAt(0)==Character.toUpperCase(word.charAt(0))) && (st == st.toLowerCase())){
                return true;
            }
        }
        return false;
    }
}