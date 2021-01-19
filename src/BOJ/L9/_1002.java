package BOJ.L9;

import java.util.Scanner;

public class _1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            // 사람1 좌표 (x1, y1)
            // 1이 계산한 상대편과의 거리 r1
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();

            // 사람2 좌표 (x2, y2)
            // 2가 계산한 상대편과의 거리 r2
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            // 상대편이 있을 수 있는 좌표의 수 구하기 = 두 원의 교점의 개수를 구하는 문제

            // 두 원의 교점의 개수를 구하기 위한 거리, 반지름 길이의 제곱값 변수 선언
            int d = (int)Math.pow(x2 - x1, 2) + (int)Math.pow(y2 - y1, 2); // 중점 간 거리 d의 제곱
            int rPlus = (int)Math.pow(r2 + r1, 2); // 반지름 길이 합의 제곱
            int rMinus = (int)Math.pow(r2 - r1, 2); // 반지름 길이 차의 제곱

            if(x1 == x2 && y1 == y2 && r1 == r2) { // 접점이 무한개
                System.out.println(-1);
            }else if(d == rPlus || d == rMinus) { // 접점이 1개
                System.out.println(1);
            }else if(d > rPlus || d < rMinus) { // 접점이 0개
                System.out.println(0);
            }else{ // 점점이 2개 (위 제외한 나머지)
                System.out.println(2);
            }

        }
    }
}
