package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        List<String> swaps = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    swaps.add("(" + j + "," + (j + 1) + ")");
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < swaps.size(); i++) {
            if (i > 0) sb.append(", ");
            sb.append(swaps.get(i));
        }
        if (swaps.isEmpty()) {
            System.out.println("обменов не требуется");
        } else {
            System.out.println("обмены позиций " + sb);
        }
        System.out.println(swaps.size());
        sc.close();
    }
}
