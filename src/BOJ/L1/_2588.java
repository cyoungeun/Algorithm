package BOJ.L1;

import java.util.Scanner;

public class _2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        System.out.println(n1 * (n2 % 10));
        System.out.println(n1 * ((n2 % 100) / 10));
        System.out.println(n1 * (n2 / 100));
        System.out.println(n1 * n2);
    }
}
