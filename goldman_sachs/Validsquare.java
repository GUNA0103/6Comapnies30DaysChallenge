package goldman_sachs;

import java.util.*;

public class Validsquare {
    public static boolean valid_square(int[] p1, int[] p2, int[] p3, int[] p4) {

        HashSet<Integer> set = new HashSet<>();
        int a1 = (int) Math.pow(p2[0] - p1[0], 2) + (int) Math.pow(p2[1] - p1[1], 2);
        int a2 = (int) Math.pow(p3[0] - p1[0], 2) + (int) Math.pow(p3[1] - p1[1], 2);
        int a3 = (int) Math.pow(p4[0] - p1[0], 2) + (int) Math.pow(p4[1] - p1[1], 2);
        int a4 = (int) Math.pow(p3[0] - p2[0], 2) + (int) Math.pow(p3[1] - p2[1], 2);
        int a5 = (int) Math.pow(p4[0] - p2[0], 2) + (int) Math.pow(p4[1] - p2[1], 2);
        int a6 = (int) Math.pow(p4[0] - p3[0], 2) + (int) Math.pow(p4[1] - p3[1], 2);
        set.add(a1);
        set.add(a2);
        set.add(a3);
        set.add(a4);
        set.add(a5);
        set.add(a6);
        if (set.size() == 2 && !set.contains(0))
            return true;

        return false;
    }

    public static void main(String[] args) {

        Scanner gt = new Scanner(System.in);
        int arr1[] = new int[2];
        int arr2[] = new int[2];
        int arr3[] = new int[2];
        int arr4[] = new int[2];
        for (int i = 0; i < 2; i++) {

            arr1[i] = gt.nextInt();
            arr2[i] = gt.nextInt();
            arr3[i] = gt.nextInt();
            arr4[i] = gt.nextInt();
        }
        System.out.println(valid_square(arr1, arr2, arr3, arr4));
    }

}
