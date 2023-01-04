import java.util.*;

public class minimum_deletion {
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return gcd(b % a, a);
        }

    }

    public static int minOperations(int[] nums, int[] numsdivide) {
        int res = numsdivide[0];
        int count = 0;
        for (int i : numsdivide) {
            res = gcd(res, i);
        }
        Arrays.sort(nums);
        // System.out.println(res);
        for (int i = 0; i < nums.length; i++) {
            if (res % nums[i] != 0) {
                count++;
            } else {
                return count;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner gt = new Scanner(System.in);
        int m = gt.nextInt();
        int n = gt.nextInt();
        int arr[] = new int[m];
        int arr1[] = new int[n];
        for (int i = 0; i < m; i++) {
            arr[i] = gt.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr1[i] = gt.nextInt();
        }
        System.out.print(minOperations(arr, arr1));
    }

}
