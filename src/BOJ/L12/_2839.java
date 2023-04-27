package BOJ.L12;

import java.util.Scanner;

public class _2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = 0; // 3으로 나눴을 때 필요한 결과값 출력 위한 변수
        while (true) {
            if(n % 5 == 0) { // 5로 나누어 떨어지는 숫자는
                System.out.println(n / 5 + count); // 5를 나눈 몫과 +count 값
                break;
            }else if(n <= 0) { // 0보다 같거나 작은 값이면 나눌 수 없음
                System.out.println(-1);
                break;
            }

            // 위의 조건 값에 걸리지 않을 때
            // 값을 -3씩 줄여주고 다시 위에 조건 값에 실행하며 값을 찾음
            n -= 3;
            count++;
        }

    }
}
