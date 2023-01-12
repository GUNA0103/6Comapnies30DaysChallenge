package goldman_sachs;

import java.util.*;

public class invalid_transactions {
    public static List<String> invalidTransactions(String[] transactions) {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> place = new ArrayList<>();
        ArrayList<Integer> time = new ArrayList<>();
        ArrayList<Integer> amount = new ArrayList<>();
        ArrayList<String> fin = new ArrayList<>();
        for (int i = 0; i < transactions.length; i++) {
            String st1[] = transactions[i].split(",");
            int a = Integer.parseInt(st1[2]);
            name.add(st1[0]);
            place.add(st1[3]);
            time.add(Integer.parseInt(st1[1]));
            amount.add(Integer.parseInt(st1[2]));
            if (a > 1000)
                fin.add(transactions[i]);

        }
        for (int i = 0; i < transactions.length; i++) {
            for (int j = 0; j < transactions.length; j++) {
                if (name.get(i).equals(name.get(j)) && (!place.get(i).equals(place.get(j)))) {
                    int dif1 = time.get(i);
                    int dif2 = time.get(j);

                    if (Math.abs(dif1 - dif2) <= 60) {
                        if (amount.get(i) <= 1000) {
                            fin.add(transactions[i]);
                            break;
                        }
                    }

                }
            }

        }
        System.out.println(fin);
        return fin;

    }

    public static void main(String[] args) {
        Scanner gt = new Scanner(System.in);
        int t = gt.nextInt();
        String str[] = new String[t];
        for (int i = 0; i < t; i++) {
            str[i] = gt.next();
        }
        System.out.println(invalidTransactions(str));
    }

}
