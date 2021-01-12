package BOJ.L9;

import java.util.Scanner;

public class _4948 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 범위는 최대 123456까지 => 2n은 246912
        // 246912 +1 (배열 인덱스는 0부터 시작하므로 +1)
        int prime[] = new int[246913]; // 소수를 저장 할 배열 생성

        for (int i = 2; i <= 246912; i++) {
            if (prime[i] == 1) {
                continue; // 이미 걸러진 수의 배수는 건너뛰기
            }

            // 소수 i를 발견할 때 마다, 해당하는 i의 배수들을 모두 소수가 아니라고 표시하기 위해 1로 초기화
            for (int j = 2 * i; j <= 246912; j += i) {
                prime[j] = 1; // i가 소수였을 경우 그 다음 큰 배수 부터 모두 1로 초기화
            }

        }

        while(true) {
            int n = scanner.nextInt();

            if (n == 0) {
                break;  // 0 입력 시 종료
            }

            int count = 0; // 소수의 개수

            for (int i = n + 1; i <= 2 * n; i++) { // n 초과 2n 이하 사이에 있는 수
               if(prime[i] != 1 && i != 1) { // 위의 배수를 모두 지우고 남는 숫자 = 소수
                    count++;
                }
            }
            System.out.println(count); // 각 테스트케이스에 대한 소수의 개수 출력
        }

    }
}
