from typing import List


class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        intersections = []
        hash = {}

        for num2 in nums2:
            if num2 in hash:
                hash[num2] += 1
            else:
                hash[num2] = 1

        for num1 in nums1:
            if num1 in hash and hash[num1] > 0:
                intersections.append(num1)
                hash[num1] -= 1
        return intersections


s= Solution()
nums1 = [1, 2, 2, 1]
nums2 = [2, 2]
print(s.intersect(nums1, nums2))

nums1 = [4,9,5]
nums2 = [9,4,9,8,4]
print(s.intersect(nums1, nums2))

nums1 = [1,2,2,1]
nums2 = [2]
print(s.intersect(nums1, nums2))
