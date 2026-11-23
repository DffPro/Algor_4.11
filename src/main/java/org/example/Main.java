package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int k = 0; k < q; k++) {
            int x = sc.nextInt();
            System.out.println(closest(arr, x));
        }
        sc.close();
    }

    static int closest(int[] arr, int x) {
        int lo = 0, hi = arr.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < x) lo = mid + 1;
            else hi = mid;
        }

        int best = arr[lo];
        if (lo > 0) {
            int left = arr[lo - 1];
            int right = arr[lo];
            if (Math.abs(left - x) <= Math.abs(right - x)) best = left;
        }
        return best;
    }
}
