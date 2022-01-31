package BOJ.L10;

import java.util.Scanner;

public class _10870 {
    // 재귀함수 구현
    //  Fn = Fn-1 + Fn-2
    public static int fac(int n) {
        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        return fac(n-1) + fac(n-2);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n >= 0 && n <= 20) {
            System.out.println(fac(n));
        }
    }
}
