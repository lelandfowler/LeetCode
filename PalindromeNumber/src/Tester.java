import java.math.BigInteger;

class Tester {
    public static void main(String arg[]){
        int input_1 = 121;
        int input_2 = -121;
        int input_3 = 10;
        int input_4 = 232;
        int input_5 = 79597;
        int input_6 = 123454321;
//        BigInteger input_7 = new BigInteger("1111111123456789876543211111111");
//        BigInteger input_8 = new BigInteger("-1111111123456789876543211111111");
        boolean expected_output_1 = true;
        boolean expected_output_2 = false;
        boolean expected_output_3 = false;

        int[] inputs = new int[]{input_1,input_2, input_3};
        boolean[] expected_outputs = new boolean[]{expected_output_1, expected_output_2, expected_output_3};

        for(int i = 0; i < inputs.length; i++) {
            Solution test = new Solution();
            test.isPalindrome(inputs[i]);
        }
    }
}