class Solution {
    public void nextPermutation(int[] nums) {
        int temp = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                temp = i;
                for (int j = nums.length - 1; j >= 0; j--) {
                    if (nums[j] > nums[temp]) {
                        int t = nums[temp];
                        nums[temp] = nums[j];
                        nums[j] = t;
                        break;
                    }
                }
                break;
            }
        }
        int l = temp + 1;
        int r = nums.length - 1;

        while (l <= r) {
            int t = nums[r];
            nums[r] = nums[l];
            nums[l] = t;

            l++;
            r--;
        }

        System.out.println(nums);
    }
}