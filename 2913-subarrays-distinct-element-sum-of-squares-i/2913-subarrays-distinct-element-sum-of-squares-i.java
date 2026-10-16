class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        Set<Integer> hs;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                hs=new HashSet<>();
                for(int k=i;k<=j;k++){
                    hs.add(nums.get(k));
                }
                sum+=hs.size()*hs.size();
            }
        }
        return sum;
    }
}