package BOJ.L5;

import java.util.Scanner;

public class _3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rArr[] = new int[10];
        int dCnt = 0; // 서로 다른 나머지 값의 개수

        for(int i = 0; i < 10; i++) {
            int n = scanner.nextInt();
            int r = n % 42;
            rArr[i] = r; // 42로 나눈 나머지 값 배열에 저장
        }

        for(int i = 0; i < 10; i++) {
            int cnt = 0; // 배열 중 중복 값 있을 시 증가될 값
            for(int j = i+1; j < 10; j++) {
                if(rArr[i] == rArr[j]) {
                    cnt++;
                }
            }
            if(cnt == 0) { // 같은 값이 없을 경우
                dCnt++;
            }
        }
        System.out.println(dCnt);
    }
}
