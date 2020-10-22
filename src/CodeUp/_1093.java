package CodeUp;

import java.util.Scanner;

public class _1093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 출석번호 부른 횟수

        int nArr[] = new int[n];
        for(int i = 0; i < n; i++){
            nArr[i] = scanner.nextInt(); // 랜덤 n개의 번호(1 ~ 23)
        }

        int nCount[] = new int[23]; // 출력

        for(int i = 0; i < n; i++){
            nCount[nArr[i] - 1]++;
        }

        for(int i = 0; i < 23; i++){
            System.out.printf("%d ", nCount[i]);
        }
    }
}
