from typing import List


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        a = 0
        for n in nums:
            a ^= n
        return a


problem_sets = [
    [2, 2, 1],
    [4, 1, 2, 1, 2],
    [1],
]

s = Solution()
for problem_set in problem_sets:
    print(s.singleNumber(problem_set))
