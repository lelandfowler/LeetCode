from typing import List


class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        for i in range(len(nums)):
            if nums[i] == 0:
                nums.remove(0)
                nums.append(0)


s = Solution()
nums = [0, 1, 0, 3, 12]
s.moveZeroes(nums)
print(nums)
nums = [0]
s.moveZeroes(nums)
print(nums)
