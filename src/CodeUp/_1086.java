package CodeUp;

import java.util.Scanner;

public class _1086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long w, h, b;
        w = scanner.nextLong();
        h = scanner.nextLong();
        b = scanner.nextLong();

        double result = (double)(w * h * b) / 8 / 1024 / 1024;
        System.out.format("%.2f MB", result);
    }
}
