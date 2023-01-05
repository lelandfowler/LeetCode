public class Tester {
    public static void main(String arg[]) {
        String input_1 = "III";
        String input_2 = "LVIII";
        String input_3 = "MCMXCIV";
        String input_4 = "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMDCCCLXXXVIII";
        String input_5 = "MMMDCCCLXXXVIII";
        String input_6 = "MMMCMXCIX";
        int expected_output_1 = 3;
        int expected_output_2 = 58;
        int expected_output_3 = 1994;
        int expected_output_4 = -1;
        int expected_output_5 = 3888;
        int expected_output_6 = 3999;


        String[] inputs = new String[]{
                input_1,
                input_2,
                input_3,
                input_4,
                input_5,
                input_6
        };

        int[] expected_outputs = new int[]{
                expected_output_1,
                expected_output_2,
                expected_output_3,
                expected_output_4,
                expected_output_5,
                expected_output_6
        };

        for (int i = 0; i < inputs.length; i++) {
            Solution test = new Solution();
            int result = test.romanToInt(inputs[i]);
            boolean matches_expected = result == expected_outputs[i];
            System.out.println("Test#" + (i + 1) + " matches expected result: " + matches_expected);
        }
    }
}
