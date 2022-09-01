//Constraints -231*10^31 <= x <= 231*10^31 - 1
import java.util.Arrays;

class Solution {
    public Solution() {
    }

    public boolean isPalindrome(int x) {
        byte a = (byte) x;
        String s1 = String.format("%8s", Integer.toBinaryString(a & 0xFF)).replace(' ', '0');
        System.out.println(s1);
        return false;
    }
}