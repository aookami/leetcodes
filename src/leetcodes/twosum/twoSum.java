package leetcodes.twosum;

public class twoSum {

    public int[] twoSumc(int[] nums, int target) {
        int[] anwser = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                    anwser[0] = i;
                    anwser[1] = j;
                }
        }
        return anwser;
    }




    public static void main(String[]args){

    }
}


