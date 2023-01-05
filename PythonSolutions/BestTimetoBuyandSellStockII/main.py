from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        """
        Calculates the max profits by finding the local minima and assuming buying took place at the
        low and selling takes place at the high.
        Takes a list of integers and returns an integer value
        """

        if len(prices) == 0 or len(prices) == 1:
            return 0

        lowest = prices[0]
        highest = prices[0]
        total_profit = 0
        i = 0
        for i in range(len(prices)):
            current_element = prices[i]
            if current_element > lowest:
                total_profit += current_element - lowest
                lowest = current_element
                highest = current_element
            elif current_element < lowest:
                lowest = current_element
        return total_profit


s = Solution()
price_list = [7,1,5,3,6,4]
print(s.maxProfit(price_list))
price_list = [1,2,3,4,5]
print(s.maxProfit(price_list))
price_list = [7,6,4,3,1]
print(s.maxProfit(price_list))