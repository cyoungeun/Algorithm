package BOJ.L4;

import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int scoreArr[] = new int[n];
        float xScore[] = new float[n];
        float max = scoreArr[0];
        float sum = 0;
        float avg = 0;

        for(int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            scoreArr[i] = score;

            if(scoreArr[i] > max) {
                max = scoreArr[i];
            }
        }

        for(int i = 0; i < scoreArr.length; i++) {
            xScore[i] = scoreArr[i] / max * 100;
            sum += xScore[i];
            avg = sum / n;
        }
        System.out.println(avg);
    }
}
