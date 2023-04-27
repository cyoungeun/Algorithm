package BOJ.L0;

import java.util.Scanner;

public class _2775 {
    public static void main(String[] args) {

        // 아파트 거주 조건
        // a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들 수의 합만큼 사람들을 데려와 살아야함

        // k층에 n호에는 몇 명이 살고 있는지 출력 (범위 - 1 ≤ k, n ≤ 14)
        // 아파트에는 0층부터 각 층에는 1호부터 , 0층의 i호에는 i명이 거주
        // 점화식 이용 : apt[k][n] = apt[k-1][n] + apt[k][n-1]

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[][] apt = new int[15][14]; // 아파트 배열 생성

        for (int i = 0; i < 14; i++) {
            apt[0][i] = i + 1; // 층 수는 1층 부터 시작하기 때문에 0층의 i호 = i+1
        }

        for (int i = 1; i < apt.length; i++) {
            for (int j = 0; j < apt[i].length; j++) {
                for (int l = 0; l <= j; l++) {
                    apt[i][j] += apt[i - 1][l]; // 현재 층의 호수의 사람들의 수를 저장하기 위한 나머지 거주하는 사람들의 수 누적
                }
            }
        }

        // 테스트
        for (int i = 0; i < t; i++) {
            int k = scanner.nextInt(); // 층
            int n = scanner.nextInt(); // 호

            System.out.println(apt[k][n - 1]);
        }
    }
}
