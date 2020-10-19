package CodeUp;

import java.util.Scanner;

public class _1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long h, b, c, s;
        h = scanner.nextLong();
        b = scanner.nextLong();
        c = scanner.nextLong();
        s = scanner.nextLong();

        double total = 0;
        if(h > 0 && h <= 48000 &&
                b > 0 && b <= 32 && b % 8 == 0 &&
                c > 0 && c <= 5 &&
                s > 0 && s <= 6000) {
            total = h * b * c * s;
        }

        double result = ((total / 8) / Math.pow(2, 10)) / Math.pow(2, 10);
        System.out.format("%.1f MB", result);
    }
}
