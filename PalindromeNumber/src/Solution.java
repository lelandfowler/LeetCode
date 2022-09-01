//Constraints -231*10^31 <= x <= 231*10^31 - 1

import java.math.BigInteger;

class Solution {
    public Solution() {
    }

//    public boolean isPalindrome(int x) {
//        String asString = String.valueOf(x);
//        BigInteger as_Big = new BigInteger(asString);
//        BigInteger working_value = new BigInteger(asString);
//        int length = asString.length();
//        BigInteger reverse = new BigInteger("0");
//        BigInteger base = new BigInteger("10");
//        while(working_value.compareTo(BigInteger.valueOf(1))>=0){
//            BigInteger mod = working_value.remainder(base);
//            BigInteger power = new BigInteger(String.valueOf((int) Math.pow(10,length-1)));
//            reverse =  reverse.add(mod.multiply(power));
//            working_value= working_value.divide(base);
//            length-=1;
//        }
//        return reverse.compareTo(as_Big)==0;
//    }

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