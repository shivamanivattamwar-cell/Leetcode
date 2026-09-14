class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,List<Integer>> hm=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],new ArrayList<>());
            }
            hm.get(nums[i]).add(i);
        }
        int c=0;
        for(int x:hm.keySet()){
            if(hm.get(x).size()>=3){
                int diff=hm.get(x).get(1)-hm.get(x).get(0);
                boolean found=true;
                for(int i=2;i<hm.get(x).size();i++){
                    int track=hm.get(x).get(i)-hm.get(x).get(i-1);
                    if(track!=diff){
                        found=false;
                        break;
                    }
                }
                if(found){
                    c++;
                }
            }
        }
        return c;
    }
}