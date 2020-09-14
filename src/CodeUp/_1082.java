package CodeUp;

import java.util.Scanner;

public class _1082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        for(int i = 1; i < 16; i++){
            int x = Integer.parseInt(n, 16);
            int dan = x * i;

            System.out.printf("%X", x);
            System.out.print("*");
            System.out.printf("%X", i);
            System.out.print("=");
            System.out.printf("%X\n", dan);
        }
    }
}
