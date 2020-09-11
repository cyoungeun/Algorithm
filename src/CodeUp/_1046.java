package CodeUp;

import java.util.Scanner;

public class _1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        System.out.printf("%d\n", a+b+c);
        System.out.printf("%.1f", (a+b+c)/(double)3);
    }
}
