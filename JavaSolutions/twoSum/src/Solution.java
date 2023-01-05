import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int pair_match = target - nums[i];
            if (hash.containsKey(pair_match)){
                return new int[]{hash.get(pair_match),i};
            }
            hash.put(nums[i], i);
        }
        return null;
    }
}