// 1 <= s.length <= 15
// s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
// It is guaranteed that s is a valid roman numeral in the range [1, 3999].

import java.util.*;

class Solution {
    public int romanToInt(String s) {
        if(s.length()<=15){
            int numeral_as_number = 0;
            int last_value = 1000;
            for(int i = 0; i < s.length(); i++){
                int value = romanNuminary(s.charAt(i));
                if(value>last_value) numeral_as_number-=(2*last_value);
                numeral_as_number+=value;
                last_value = value;
            }
            return numeral_as_number;
        }
        return -1;
    }
    private int romanNuminary ( char c){
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}