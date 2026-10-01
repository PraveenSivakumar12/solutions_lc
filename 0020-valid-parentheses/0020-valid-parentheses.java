class Solution {
    public boolean isValid(String st) {

        if (st.length() == 0) return false;
        if (st.length() == 1) return false;

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < st.length(); i++) {

            char ch = st.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            }
            else {

                if (s.isEmpty()) {
                    return false;
                }

                if (ch == ')' && s.pop() != '(') {
                    return false;
                }
                else if (ch == ']' && s.pop() != '[') {
                    return false;
                }
                else if (ch == '}' && s.pop() != '{') {
                    return false;
                }
            }
        }

        return s.isEmpty();
    }
}