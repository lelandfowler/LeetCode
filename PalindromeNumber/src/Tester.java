import java.math.BigInteger;

class Tester {
    public static void main(String arg[]){
        int input_1 = 121;
        int input_2 = -121;
        int input_3 = 10;
        int input_4 = 232;
        int input_5 = 79597;
        int input_6 = 345676543;
        boolean expected_output_1 = true;
        boolean expected_output_2 = false;
        boolean expected_output_3 = false;
        boolean expected_output_4 = true;
        boolean expected_output_5 = true;
        boolean expected_output_6 = true;
        boolean expected_output_7 = false;


        int[] inputs = new int[]{
                input_1,
                input_2,
                input_3,
                input_4,
                input_5,
                input_6,
        };

        boolean[] expected_outputs = new boolean[]{
                expected_output_1,
                expected_output_2,
                expected_output_3,
                expected_output_4,
                expected_output_5,
                expected_output_6
        };

        for(int i = 0; i < inputs.length; i++) {
            Solution test = new Solution();
            boolean result = test.isPalindrome(inputs[i]);
            boolean matches_expected = result == expected_outputs[i];
            System.out.println("Test#"+(i+1)+" matches expected result: "+matches_expected);

        }
    }
}