package BOJ.L3;

import java.util.Scanner;

public class _25314 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n == 4) {
            System.out.print("long int");
        }else {
            int m = n / 4;
            for(int i = 0; i < m; i++) {
                System.out.print("long ");
            }
            System.out.print("int");
        }

    }
}
