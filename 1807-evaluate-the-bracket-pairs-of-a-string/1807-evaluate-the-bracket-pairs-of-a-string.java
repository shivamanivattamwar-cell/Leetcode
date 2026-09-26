class Solution {
    public String evaluate(String s, List<List<String>> k) {
        Map<String, String> hm = new HashMap<>();
        for (int i = 0; i < k.size(); i++) {
            hm.put(k.get(i).get(0), k.get(i).get(1));
        }
        String res = "";
        boolean found = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                found = false;
            } else if (c == ')') {
                found = true;
                String value = hm.get(res);

                if (value == null) {
                    sb.append('?');
                } else {
                    sb.append(value);
                }
                res = "";
            } else if (found) {
                sb.append(c);
            } else {
                res += c;
            }
        }

        return sb.toString();
    }
}