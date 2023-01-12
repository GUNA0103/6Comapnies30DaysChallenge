package goldman_sachs;

import java.util.*;

public class factorial_trauiling_zeros {
    public static int trailingZeroes(int n) {
        int count = 0;
        while (n >= 5) {

            n = n / 5;
            count = count + n;

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner gt = new Scanner(System.in);
        int n = gt.nextInt();
        System.out.println(trailingZeroes(n));

    }
}
