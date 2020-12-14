package BOJ.L5;

import java.util.Scanner;

public class _4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();

        for(int i = 0; i < c; i++) {
            int n = scanner.nextInt();
            int nScore[] = new int[n];

            float sum = 0;
            for(int j = 0; j < n; j++) {
                int score = scanner.nextInt();
                nScore[j] = score;
                sum += score;
            }

            float avg = sum / n;
            float cnt = 0;

            // 평균 넘는 학생 수
            for(int j = 0; j < n; j++) {
                if(nScore[j] > avg) {
                    cnt++;
                }
            }

            // 평균 넘는 학생 수 비율 출력
            System.out.printf("%.3f%%\n", (cnt / n)*100);
        }
    }
}
