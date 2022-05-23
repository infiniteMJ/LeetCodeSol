class Solution {
    public int maxSubArray(int[] nums) {
        int res = 0;
        int maxRes = nums[0];
        for (int num : nums) {
            res = Math.max(res + num, num);
            maxRes = Math.max(maxRes, res);
        }
        return maxRes;
    }
}
