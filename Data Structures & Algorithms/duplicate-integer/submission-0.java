class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDup = false;
        int[] seen = Arrays.copyOf(nums, nums.length);

        for (int i = 0; i< nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == seen[j]) {
                    isDup = true;
                }
            }
        }
        return isDup;
    }
        
}