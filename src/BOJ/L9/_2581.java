package BOJ.L9;

import java.util.Scanner;

public class _2581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        boolean flag; // 소수 아닌 수 판별해줄 변수

        int sum = 0;
        int min = 10000; // 입력받는 수의 최대값은 10000이기 때문에 int 타입의 최대 수(Integer.MAX_VALUE) 를 min 값으로 초기화 후 사용

        // m은 n보다 작거나 같다.
        if(m <= n) {
            for(int i = m; i <= n; i++) { // m이상 n이하 자연수 구하기
                flag = true;

                for(int j = 2; j < i; j++) {
                    if(i % j == 0) {
                        flag = false; // 제외하기 위해 false
                        break;
                    }
                }

                if(i > 1 && flag == true) {
                    sum += i; // 소수들의 합

                    if(i < min) {
                        min = i; // 소수들 중 최솟값
                    }
                }
            }

            if(sum == 0) { // 소수가 없을 때
                System.out.println(-1);
            }else {
                System.out.println(sum);
                System.out.println(min);
            }
        }

    }
}
