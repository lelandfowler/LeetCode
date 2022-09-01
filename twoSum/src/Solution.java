import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = null;
        int array_size = (int) Arrays.stream(nums).count();
        for(int i = 0; i < array_size; i++) {
            int current_element = nums[i];
            int pair_to_match = target - current_element;
            for (int j = i +1; j< array_size; j++){
                int possible_match = nums[j];
                if (possible_match == pair_to_match) {
                    result = new int[]{i, j};
                    break;
                }
            }
        }
        return result;
    }
}