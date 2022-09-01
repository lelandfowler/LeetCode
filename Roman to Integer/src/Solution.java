// 1 <= s.length <= 15
// s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
// It is guaranteed that s is a valid roman numeral in the range [1, 3999].

import java.util.*;

class Solution {
    public int romanToInt(String s) {
        if (s.length() <= 15){
            Map<String, Integer> roman_numinary = new HashMap<>(){};
            roman_numinary.put("I",1);
            roman_numinary.put("V",5);
            roman_numinary.put("X",10);
            roman_numinary.put("L",50);
            roman_numinary.put("C",100);
            roman_numinary.put("D",500);
            roman_numinary.put("M",1000);

            int value_holder = 0;
            int last_value = 0;
            int total_value = 0;

//            Start from right and build upwards
            for(int i = s.length() - 1; i>=0; i--){
                char current_character = s.charAt(i);
                String current_character_as_string = String.valueOf(current_character);
                int current_value = roman_numinary.get(current_character_as_string);
                // If the last value is less than the current value
                if(current_value == last_value){
                    value_holder+= last_value;
                    last_value = current_value;
                } else if (current_value < last_value) {
                    value_holder-= current_value;
                    last_value = current_value;
                } else if (current_value > last_value) {
                    total_value+= current_value;
                    total_value+=value_holder;
                    last_value = current_value;
                    value_holder = 0;

                }
            }
            total_value+=value_holder;
            return total_value;
        }
        else return -1;
    }
}