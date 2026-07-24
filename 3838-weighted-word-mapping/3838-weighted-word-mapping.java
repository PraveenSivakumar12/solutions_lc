import java.util.*;
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuffer str = new StringBuffer();
        for(int i=0;i<words.length;i++){
            str.append(words[i]);
            str.append(",");
        }
        String st = str.toString();
        char[] arr = st.toCharArray();
        StringBuffer sb = new StringBuffer();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            char a = arr[i];
            if(a!=','){
                int av = (int) a;
                av=av-96;
                sum+=weights[av-1];
            }
            else{
                sum%=26;
                int ch = Math.abs(sum-26);
                char chr = (char) ('A'+(ch-1));
                sb.append(chr);
                sum = 0;
            }
        }
        return sb.toString().toLowerCase(); 
      }
}