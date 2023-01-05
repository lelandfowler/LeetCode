from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hash = {}
        for i in range(len(nums)):
            if nums[i] in hash:
                return [i, hash[nums[i]]]
            else:
                hash[target - nums[i]] = i


s = Solution()
nums = [2, 7, 11, 15]
target = 9
print(s.twoSum(nums, target))
nums = [3, 2, 4]
target = 6
print(s.twoSum(nums, target))
nums = [3, 3]
target = 6
print(s.twoSum(nums, target))
