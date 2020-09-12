package CodeUp;

import java.util.Scanner;

public class _1063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a < b ? b : a);
    }
}
