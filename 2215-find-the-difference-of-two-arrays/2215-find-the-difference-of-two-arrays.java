class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new ArrayList<>();
        Set<Integer> hs1 = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();

        for (int x : nums1) {
            hs1.add(x);
        }

        for(int x:nums2){
           hs2.add(x);
        }
        for(int x:nums1){
            if(hs2.contains(x)){
                hs1.remove(x);
                hs2.remove(x);
            }
        }
        List<Integer> a=new ArrayList<>();
        for(int x:hs1){
            a.add(x);
        }
        res.add(a);

        List<Integer> b=new ArrayList<>();
        for(int x:hs2){
            b.add(x);
        }
        res.add(b);
        return res;
    }
}