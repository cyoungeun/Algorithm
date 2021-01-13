package BOJ.L9;

import java.util.Scanner;

public class _9020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {

            int n = scanner.nextInt();

            // n은 2보다 큰 짝수
            if(n % 2 == 0 && n > 2) {

                // 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재
                // 10000+1
                int prime[] = new int[10001];

                // 에라토스테네스의 체
               for (int j = 2; j <= n; j++) {

                    if (prime[j] == 1) {
                        continue; // 이미 걸러진 수의 배수는 건너뛰기
                    }

                    // 소수 i를 발견할 때 마다, 해당하는 i의 배수들을 모두 소수가 아니라고 표시하기 위해 1로 초기화
                    for (int k = 2 * j; k <= n; k += j) {
                        prime[k] = 1; // i가 소수였을 경우 그 다음 큰 배수 부터 모두 1로 초기화
                    }
                }
               

                // 입력받은 짝수 n을 절반 씩 나누어 검사
                int n1 = n / 2;
                int n2 = n / 2;

                while (true) {
                    if (prime[n1] != 1 && prime[n2] != 1) { // 두 수 모두 prime 배열 값이 1 아닐 경우 소수
                        System.out.println(n1 +" "+ n2); // 두 소수 차이가 가장 작은 골드바흐 파티션 출력
                        break;
                    }
                    
                    // 두 수 모두가 소수일 때 까지 각 값을 감소, 증가하며 찾기
                    n1--; 
                    n2++; 
                }

            }

        }

    }
}
