class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0;
        int minPrefix = 0;

        for (int x : nums) {
            sum += x;
            minPrefix = Math.min(minPrefix, sum);
        }

        return 1 - minPrefix;
    }
}