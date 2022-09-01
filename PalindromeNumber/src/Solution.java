//Constraints -231*10^31 <= x <= 231*10^31 - 1

import java.math.BigInteger;

class Solution {
    public Solution() {
    }

    public boolean isPalindrome(int x) {
//        case #1: 0-9
        if(x >= 0 && x <= 9) return true;
//        case #2: negitive or ending in zero
        if(x < 0 || x % 10 == 0) return false;

//        build half of the possible palindrome
        int result = 0;
        while(result < x){
            result = result * 10 + x % 10;
            x/=10;
        }

//        case #3: if odd length
        if (result > x){
            return result/10 == x;
        }
//        case #4: else if even length
        else{
            return result == x;
        }
    }
}