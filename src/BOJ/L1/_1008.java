package BOJ.L1;

import java.util.Scanner;

public class _1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if(a > 0 && b < 10){
            System.out.println(a / b);
        }
    }
}
