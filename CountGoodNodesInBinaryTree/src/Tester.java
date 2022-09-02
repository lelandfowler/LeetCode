public class Tester {
    public static void main(String arg[]) {
        Solution.Tree input_1 = new Solution.Tree(new int[]{3,1,4,3, Integer.parseInt(null),1,5});
        TreeNode input_2 = [3,3,null,4,2];
        TreeNode input_3 = [1];

        int expected_output_1 = 4;
        int expected_output_2 = 3;
        int expected_output_3 = 1;


        Tree[] inputs = new Tree[]{
                input_1,
                input_2,
                input_3,
        };

        int[] expected_outputs = new int[]{
                expected_output_1,
                expected_output_2,
                expected_output_3,
        };

        for (int i = 0; i < inputs.length; i++) {
            Solution test = new Solution();
            int result = test.goodNodes(inputs[i]);
            boolean matches_expected = result == expected_outputs[i];
            System.out.println("Test#" + (i + 1) + " matches expected result: " + matches_expected);
        }
    }
}
