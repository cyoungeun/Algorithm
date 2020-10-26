package BOJ.L1;

import java.util.Scanner;

public class _1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a > 0 && b < 10) {
            System.out.println(a - b);
        }
    }
}
