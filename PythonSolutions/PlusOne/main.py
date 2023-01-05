class Solution:
    def plusOne(self, digits: List[int], list_len=-1) -> List[int]:
        """
        Takes a list of digits representing a number and adds
        one to the last digit
        returns the updated list of digits
        """
        # case-1: last digit is not 9, add 1 to last digit and return
        # case-2a: last digit is 9 and the leading digit is not 9
        # case-2b: all digits including the leading digit are 9
        if digits:
            if list_len == -1:
                # when function is first called
                list_len = len(digits)

            if len(digits) == 1:
                # add one to last digit
                digits[0] += 1

            else:
                # if not the last digit recursively call plusOne
                current_head = digits[0:1]
                digits = current_head + self.plusOne(digits[1:], list_len)

            if len(digits) > 1 and digits[1] == 10:
                # carry 1 if applicable
                digits[1] = 0
                digits[0] += 1

            if list_len == len(digits) and digits[0] == 10:
                # For highest digit carry 1 if applicable
                # by adding to array
                digits[0] = 0
                digits = [1] + digits

        return digits



digits = [1,2,3]

digits = [4,3,2,1]

digits = [9]