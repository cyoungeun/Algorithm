package BOJ.L8;

import java.util.Scanner;

public class _1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int x = scanner.nextInt(); // 현재 위치
            int y = scanner.nextInt(); // 목표 위치
            
            int d = y - x; // 이동 거리
            int count = 0; // 이동 횟수
            int max = (int)Math.sqrt(d); // // 최대 이동 거리 = 제곱근(√) 이동거리(d) = √d


            if(max == Math.sqrt(d)) { // 루트 값이 정수 일 경우
                count = 2 * max - 1;
                System.out.println(count);
            }else if(d <= (max * max) + max) { // 같은 max 값의 두번째 구간 부분
                count = 2 * max;
                System.out.println(count);
            }else { // 나머지 부분
                count = 2 * max + 1;
                System.out.println(count);
            }

        }

    }
}
