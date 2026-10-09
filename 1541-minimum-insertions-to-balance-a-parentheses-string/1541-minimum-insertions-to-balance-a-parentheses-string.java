class Solution {
    public int minInsertions(String s) {
        Stack<Character> st = new Stack<>();
        int ct = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push(c);
            } else {
                if (!st.isEmpty() && st.peek() == '(') {
                    if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                        st.pop();
                        i++;
                    } else {
                        st.pop();
                        ct++;
                    }
                } else {
                    if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                        ct++;
                        i++;
                    } else {
                        ct += 2;
                    }
                }
            }
        }

        return ct + 2 * st.size();
    }
}
