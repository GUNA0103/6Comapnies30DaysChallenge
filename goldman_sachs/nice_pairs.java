package goldman_sachs;

import java.util.*;

public class nice_pairs {
    public static int countNicePairs(int[] nums) {
        long count = 0;
        int dif = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int left = nums[i];
            String x1 = left + "";
            StringBuffer y1 = new StringBuffer(x1);
            y1.reverse();
            dif = nums[i] - Integer.parseInt(y1 + "");
            if (map.containsKey(dif))
                count += map.get(dif);
            map.put(dif, map.getOrDefault(dif, 0) + 1);
        }
        return (int) count % 1000000007;

    }

    public static void main(String[] args) {
        Scanner gt = new Scanner(System.in);
        int n = gt.nextInt();
        int str[] = new int[n];
        for (int i = 0; i < n; i++) {
            str[i] = gt.nextInt();

        }
        System.out.println(countNicePairs(str));
    }

}
