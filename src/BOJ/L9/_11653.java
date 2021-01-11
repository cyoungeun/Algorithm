package BOJ.L9;

import java.util.Scanner;

public class _11653 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i = 2; i <= n; i++) {
            while (n % i == 0) { // n을 i로 나눴을 때 나머지가 없을 때 까지 계속 반복

                n /= i; // 해당 값 나누기
                System.out.println(i); // 소수 출력
            }
        }

    }
}
