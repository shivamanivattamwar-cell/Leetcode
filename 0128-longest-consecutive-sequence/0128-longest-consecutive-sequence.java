class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        Arrays.sort(nums);

        int c = 1;
        int mx = 1;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) {
                continue;
            }

            if (nums[i] == nums[i + 1] - 1) {
                c++;
            } else {
                mx = Math.max(mx, c);
                c = 1;
            }
        }

        mx = Math.max(mx, c);

        return mx;
    }
}