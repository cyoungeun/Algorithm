package CodeUp;

import java.util.Scanner;

public class _1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();

        if(a >= 0 && b > 0){
            System.out.printf("%d\n", a+b);
            System.out.printf("%d\n", a-b);
            System.out.printf("%d\n", a*b);
            System.out.printf("%d\n", a/b);
            System.out.printf("%d\n", a%b);
            System.out.printf("%.2f", a/(double)b);
        }

    }
}
