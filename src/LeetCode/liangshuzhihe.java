package LeetCode;

public class liangshuzhihe {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
    liangshuzhihe n = new liangshuzhihe();

    int[] a = {2,5,6};
    int[] b =n.twoSum(a,7);
        for (int temp:b) {
            System.out.print(temp+" ");
        }
    }
}