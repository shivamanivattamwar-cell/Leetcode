class Solution {
    public String[] findWords(String[] words) {
        Set<Character> hs1 = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p');
        Set<Character> hs2 = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l');
        Set<Character> hs3 = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm');
        List<String> li = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String k = words[i];
            boolean h1 = true;
            boolean h2 = true;
            boolean h3 = true;
            for (char c : k.toLowerCase().toCharArray()) {
                if (!hs1.contains(c)) {
                    h1 = false;
                }

                if (!hs2.contains(c)) {
                    h2 = false;
                }

                if (!hs3.contains(c)) {
                    h3 = false;
                }
            }

            if (h1 || h2 || h3) {
                li.add(k);
            }
        }

        String[] arr = new String[li.size()];
        int indx=0;
        for(String x:li){
            arr[indx++]=x;
        }
        return arr;
    }
}