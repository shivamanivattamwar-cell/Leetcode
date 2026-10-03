class Solution {
    public int secondHighest(String s) {
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                hs.add(c - '0');
            }
        }

        int mx = 0;
        int sm = 0;
        if (hs.size() == 1 || hs.isEmpty()) {
            return -1;
        }

        for (int x : hs) {
            if (x > mx) {
                sm = mx;
                mx = x;
            } else if (x > sm && x < mx) {
                sm = x;
            }
        }

        return sm;
    }
}