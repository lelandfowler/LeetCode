import java.util.Arrays;

class a_test {
    int[] number_array;
    int target;
    int[] correct_result;
    int[] calculated_result;
    boolean test_status;

    a_test(int[] number_array, int target, int[] correct_result){
        this.number_array = number_array;
        this.target = target;
        this.correct_result = correct_result;
    }

    int[]  calculate_solution(){
        Solution result = new Solution();
        this.calculated_result = result.twoSum(this.number_array, this.target);
        return this.calculated_result;
    }

    void check_solution(){
        this.test_status = Arrays.equals(this.correct_result, this.calculated_result);
    }

}

public class Test {
    public static void main(String arg[]){
        int[] num_array_1 = {2,7,11,15};
        int target_1 = 9;
        int[] correct_result_1 = {0,1};
        int[] calculated_results_1 = {};

        a_test case_1 = new a_test(num_array_1, target_1, correct_result_1);
        calculated_results_1 = case_1.calculate_solution();
        System.out.println("Calculated result: " + Arrays.toString(calculated_results_1));
        case_1.check_solution();
        System.out.println("Test result: " + case_1.test_status);

//        ___________________________________________________________________________ //

        int[] num_array_2 = {3,2,4};
        int target_2 = 6;
        int[] correct_result_2 = {1,2};
        int[] calculated_results_2 = {};

        a_test case_2 = new a_test(num_array_2, target_2, correct_result_2);
        calculated_results_2 = case_2.calculate_solution();
        System.out.println("Calculated result: " + Arrays.toString(calculated_results_2));
        case_2.check_solution();
        System.out.println("Test result: " + case_2.test_status);
    }
}

