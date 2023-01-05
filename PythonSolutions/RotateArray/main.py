from typing import List


class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        if k > len(nums):
            k = k % len(nums)
        nums[:] = nums[-k:] + nums[:-k]


s = Solution()
nums = [1, 2, 3, 4, 5, 6, 7]
s.rotate(nums, k=12)
print(nums, nums== [5, 6, 7, 1, 2, 3, 4])
nums = [-1, -100, 3, 99]
s.rotate(nums, k=2)
print(nums, nums == [3, 99, -1, -100])
nums = [1, 2, 3, 4, 5, 6, 7]
s.rotate(nums, k=12)
print(nums, nums == [3, 4 ,5, 6, 7, 1, 2])

