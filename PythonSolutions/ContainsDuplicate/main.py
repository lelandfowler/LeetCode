from typing import List


class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        found_nums = {}
        for num in nums:
            if num in found_nums:
                found_nums[num] += 1
                return True
            found_nums[num] = 1
        return False


s = Solution()
nums = [1, 2, 3, 1]
print(s.containsDuplicate(nums))
nums = [1, 2, 3, 4]
print(s.containsDuplicate(nums))
nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
print(s.containsDuplicate(nums))
