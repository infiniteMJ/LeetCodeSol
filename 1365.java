class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] res = Arrays.copyOf(nums, nums.length);
        Arrays.sort(res);
        
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(res[i])) {
                hashMap.put(res[i], i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = hashMap.get(nums[i]);
        }

        return res;
    }
}
