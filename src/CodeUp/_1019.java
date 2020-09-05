package CodeUp;

import java.util.Scanner;

public class _1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();

        String[] a = date.split("\\.");
        int y = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        int d = Integer.parseInt(a[2]);
        System.out.printf("%04d.%02d.%02d", y, m, d);
    }
}
