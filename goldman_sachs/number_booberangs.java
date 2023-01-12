package goldman_sachs;

import java.util.*;

public class number_booberangs {
    public static int numberOfBoomerangs(int[][] points) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int fin = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    int dis = (int) Math.pow(points[i][0] - points[j][0], 2)
                            + (int) Math.pow(points[i][1] - points[j][1], 2);
                    map.put(dis, map.getOrDefault(dis, 0) + 1);
                }
            }
            for (int z : map.values()) {
                fin += z * (z - 1);
            }
            map.clear();
        }
        return fin;

    }

    public static void main(String[] args) {
        Scanner gt = new Scanner(System.in);
        int n = gt.nextInt();
        int m = gt.nextInt();
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            arr[i][j] = gt.nextInt();
        }
        System.out.println(numberOfBoomerangs(arr));
    }
}
