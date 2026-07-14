class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '-') continue;
            if (count == k) {
                res.append('-');
                count = 0;
            }
            res.append(Character.toUpperCase(ch));
            count++;
        }
        return res.reverse().toString();
    }
}
