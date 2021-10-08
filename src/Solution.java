import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] arry = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arry,6)));

    }
    public static  int[] twoSum(int[] nums, int target) {
            int[] newArry = new int[2];
        for (int i=0; i<nums.length; i++){
            for (int j=0; j<nums.length; j++){
                if (target == nums[i]+nums[j]){
                    newArry[0] = i;
                    newArry[1] = j;

                }
            }
            break;
        }


return newArry;
    }
}
