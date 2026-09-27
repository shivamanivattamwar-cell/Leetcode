class Solution {
    public int[] rearrangeArray(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int[] ans=new int[nums.length];
        int ind=0;
        while(!hm.isEmpty()){
            List<Integer> li=new ArrayList<>(hm.keySet());
            for(int i:li){
                if(hm.containsKey(i)){
                    hm.put(i,hm.get(i)-1);
                    if(hm.get(i)==0){
                        hm.remove(i);
                    }
                }
            }
            Collections.sort(li);
            for(int i:li){
                ans[ind++]=i;
            }
        }
        return ans;
    }
}