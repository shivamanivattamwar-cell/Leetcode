class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> hs=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            hs.add(allowed.charAt(i));
        }
        int c=0;
        for(int i=0;i<words.length;i++){
            String k=words[i];
            boolean f=true;
            for(char x:k.toCharArray()){
                if(!hs.contains(x)){
                    f=false;
                    break;
                }
            }
            if(f){
                c++;
            }
        }

        return c;
    }
}