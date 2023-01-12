package goldman_sachs;

import java.util.*;

public class minimum_consecutivecard {
    public static int minimumCardPickup(int[] cards) {
        int a = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cards.length; i++) {
            if (!map.containsKey(cards[i])) {
                map.put(cards[i], i);
            } else {
                if (i - map.get(cards[i]) < a)
                    a = i - map.get(cards[i]);
                map.put(cards[i], i);
            }

        }
        if (a == Integer.MAX_VALUE)
            return -1;
        return a + 1;
    }

    public static void main(String[] args) {
        Scanner gt = new Scanner(System.in);
        int n = gt.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = gt.nextInt();
        }
        System.out.println(minimumCardPickup(arr));
    }
}
