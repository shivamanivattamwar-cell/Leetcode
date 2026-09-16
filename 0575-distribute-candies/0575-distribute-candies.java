class Solution {
    public int distributeCandies(int[] ct) {
        Set<Integer> hs=new HashSet<>();
        for(int x:ct){
            hs.add(x);
        }

        if(ct.length/2<=hs.size()){
            return ct.length/2;
        }
        return hs.size();
    }
}