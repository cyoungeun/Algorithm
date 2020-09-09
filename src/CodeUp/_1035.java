package CodeUp;

import java.util.Scanner;

public class _1035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        int a = Integer.parseInt(x, 16);
        System.out.printf("%o", a);
    }
}