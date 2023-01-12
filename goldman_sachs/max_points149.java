package goldman_sachs;

import java.util.*;

public class max_points149 {
    public static int maxPoints(int[][] points) {
        int len = points.length;
        int max = 2;
        if (len <= 2) {
            return len;
        }
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                count = 2;
                for (int k = j + 1; k < len; k++) {
                    int x = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]);
                    int y = (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);
                    if (x == y) {
                        count++;
                    }
                }
                if (count > max)
                    max = count;
            }

        }
        return max;

    }

    public static void main(String[] args) {
        Scanner gt = new Scanner(System.in);
        int a = gt.nextInt();
        int b = gt.nextInt();
        int arr[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = gt.nextInt();
            }
        }
        System.out.println(maxPoints(arr));
    }
}
