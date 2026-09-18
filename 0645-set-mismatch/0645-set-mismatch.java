class Solution {
    public int[] findErrorNums(int[] nums) {
        List<Integer> li=new ArrayList<>();
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.get(nums[i])==2){
                li.add(nums[i]);
            }
        }

        for(int i=1;i<=nums.length;i++){
            if(!hm.containsKey(i)){
                li.add(i);
            }
        }
        int[] arr=new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
        }

        return arr;
    }
}