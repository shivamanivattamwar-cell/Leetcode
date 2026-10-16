class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        Set<Integer> hs;
        for(int i=0;i<nums.size();i++){
            hs=new HashSet<>();
            for(int j=i;j<nums.size();j++){
               hs.add(nums.get(j));
               sum+=hs.size()*hs.size();
            }
        }
        return sum;
    }
}