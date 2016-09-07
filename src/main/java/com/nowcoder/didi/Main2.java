package com.nowcoder.didi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by 哓哓 on 2016/9/6 0006.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] t = new int[n];
            for (int i = 0; i < n; i++) {
                t[i] = sc.nextInt();
            }
            Arrays.sort(t);

            Table[] tables = new Table[m];
            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                tables[i] = new Table(x, y);
            }

            Arrays.sort(tables, new Comparator<Table>() {
                @Override
                public int compare(Table o1, Table o2) {
                    if (o1.price < o2.price) {
                        return 1;
                    } else if (o1.price > o2.price) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            });

            int sum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (tables[j].num <= t[i] && !tables[j].selected) {
                        sum += tables[j].price;
                        tables[j].selected = true;
                        break;
                    }
                }
            }

            System.out.println(sum);
        }

        sc.close();
    }
}

class Table {
    int num;
    int price;
    boolean selected = false;

    public Table(int i, int j) {
        num = i;
        price = j;
        selected = false;
    }
}
