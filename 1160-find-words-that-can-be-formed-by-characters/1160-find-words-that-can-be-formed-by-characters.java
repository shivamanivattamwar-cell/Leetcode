class Solution {
    public int countCharacters(String[] words, String chars) {
       int count=0;
       for(int i=0;i<words.length;i++){
         if(yes(words[i],chars)){
            count+=words[i].length();
         }
       }
       return count;
    }
    public boolean yes(String a,String b){
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<b.length();i++){
            hm.put(b.charAt(i),hm.getOrDefault(b.charAt(i),0)+1);
        }
        for(int i=0;i<a.length();i++){
            if(hm.containsKey(a.charAt(i))){
                hm.put(a.charAt(i),hm.get(a.charAt(i))-1);
                if(hm.get(a.charAt(i))==0){
                    hm.remove(a.charAt(i));
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}