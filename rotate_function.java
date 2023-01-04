import java.util.*;

public class rotate_function {
    public static int maxRotateFunction(int[] nums) {
        int temp = 0;
        int sarray = 0;
        for (int i = 0; i < nums.length; i++) {
            temp += i * nums[i];
            sarray += nums[i];
        }
        int max = temp;
        int si = temp;
        for (int i = nums.length - 1; i > 0; i--) {
            si = si + sarray - (nums.length * nums[i]);
            max = Math.max(si, max);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner gt = new Scanner(System.in);
        int n = gt.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = gt.nextInt();

        }
        System.out.println(maxRotateFunction(arr));

    }
}
