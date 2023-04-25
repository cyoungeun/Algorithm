package BOJ.L1;

import java.util.Scanner;

public class _3003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int k = 1;
        int q = 1;
        int l = 2;
        int b = 2;
        int n = 2;
        int p = 8;

        k = k - scanner.nextInt();
        q = q - scanner.nextInt();
        l = l - scanner.nextInt();
        b = b - scanner.nextInt();
        n = n - scanner.nextInt();
        p = p - scanner.nextInt();

        System.out.print(k + " ");
        System.out.print(q + " ");
        System.out.print(l + " ");
        System.out.print(b + " ");
        System.out.print(n + " ");
        System.out.print(p);
    }
}
