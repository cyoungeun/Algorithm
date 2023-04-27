package BOJ.L15;

import java.util.Scanner;

public class _1929 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int prime[] = new int[n + 1]; // 소수 여부를 저장해 둘 배열 생성

        for (int i = 2; i <= n; i++) {

            if (prime[i] == 1) {
                continue; // 이미 걸러진 수의 배수는 건너뛰기
            }

            // 소수 i를 발견할 때 마다, 해당하는 i의 배수들을 모두 소수가 아니라고 표시하기 위해 1로 초기화
            for (int j = 2 * i; j <= n; j += i) {
                prime[j] = 1; // i가 소수였을 경우 그 다음 큰 배수 부터 모두 1로 초기화
            }
        }

        for(int i = m; i <= n; i++) { // m이상 n이하
            if(prime[i] != 1 && i != 1) { // 위의 배수를 모두 지우고 남는 숫자 = 소수
                System.out.println(i);
            }
        }

    }
}
