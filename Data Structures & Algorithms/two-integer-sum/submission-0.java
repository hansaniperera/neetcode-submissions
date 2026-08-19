class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> tMap = new HashMap<>();
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            Integer diff = target - nums[i];
            if (tMap.containsKey(diff)) {
                ans[0] = tMap.get(diff);
                ans[1] = i;
            } else {
                tMap.put(nums[i], i);
            }
        }
        return ans;
    
    }
}
