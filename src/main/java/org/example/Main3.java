package org.example;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int comparisons = 0;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (a[j] < a[minIdx]) minIdx = j;
            }
            if (minIdx != i) {
                int tmp = a[i];
                a[i] = a[minIdx];
                a[minIdx] = tmp;
                swaps++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i > 0) sb.append(' ');
            sb.append(a[i]);
        }
        System.out.println(sb.toString());
        System.out.println("сравнений " + comparisons + ", обменов " + swaps);
        sc.close();
    }
}
