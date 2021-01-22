package BOJ.L10;

import java.util.Scanner;

public class _10872 {

    // factorial 재귀함수 구현
    public static int factorial(int n) {
        if(n < 1) { // n이 1보다 작을 경우
            return 1; // 1을 반환 후 재귀 종료
        }

        // n 팩토리얼(n!) 구하기
        return n * factorial(n-1);
    }

    // main 문
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(factorial(n));
    }

}
