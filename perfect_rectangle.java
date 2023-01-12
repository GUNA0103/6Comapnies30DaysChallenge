import java.util.*;
import java.io.*;

public class perfect_rectangle {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        int arr[][] = new int[][] { { 1, 1, 3, 3 }, { 3, 1, 4, 2 }, { 3, 2, 4, 4 }, { 1, 3, 2, 4 }, { 2, 3, 3, 4 } };
        if (arr[0].length == 0 || arr.length == 0)
            System.out.println("false");
        for (int rec[] : arr) {
            int x1 = Integer.MAX_VALUE;
            int x2 = Integer.MIN_VALUE;
            int y1 = Integer.MAX_VALUE;
            int y2 = Integer.MIN_VALUE;

            x1 = Math.min(rec[0], x1);
            x2 = Math.min(rec[0], x2);
            y1 = Math.min(rec[0], y1);
            y2 = Math.min(rec[0], y2);

            if (!set.add(rec[0] + "" + rec[1]))
                set.remove(rec[0] + "" + rec[1]);
            if (!set.add(rec[0] + "" + rec[3]))
                set.remove(rec[0] + "" + rec[3]);
            if (!set.add(rec[2] + "" + rec[3]))
                set.remove(rec[2] + "" + rec[3]);
            if (!set.add(rec[2] + "" + rec[1]))
                set.remove((rec[2] + "" + rec[1]));

        }
        System.out.println(set);

    }

}
