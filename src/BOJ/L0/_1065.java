package BOJ.L0;

import java.util.Scanner;

public class _1065 {
    public static void main(String[] args) {
        // 한수 : 양의 정수 X의 각 자릿수가 등차수열(연속된 두 개의 수의 차이가 일정한 수열)을 이루는 수
        // N이 주어졌을 때, N 이하의 한수의 수를 출력하는 문제 (N은 1000이하의 자연수)

        // 한 자리 수(1~9) : 무조건 한수
        // 두 자리 수(10~99) : 연속된 두 수의 차(공차)가 정해진 등차수열 이므로 무조건 한수
        // 세 자리 수(100~999) : 공차 계산하여 한수 판별

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(h(n)); // n이하 한수의 개수 출력
    }

    public static int h(int n) {
        int cnt = 0;
        
        for(int i = 1; i <= n; i++) {
            if(i < 100) { // 100미만 경우에는 모두 한수
                cnt++;
            }else if(i < 1000) { // 1000은 한수가 아니므로 제외, 1000미만 인 수 판별
                int n1 = i % 10; // 1의 자리 수
                int n2 = (i / 10) % 10; // 10의 자리 수
                int n3 = (i / 100) % 10; // 100의 자리 수

                // 등차수열일 경우 한수
                // ex) a-d, a, a+d이기 때문에 밑에와 같은 식을 써서 판별
                if (n1 - n2 == n2 - n3) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

}

