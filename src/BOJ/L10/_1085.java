package BOJ.L10;

import java.util.Scanner;

public class _1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 현재 위치 (x, y)
        // 직사각형의 왼쪽 아래 꼭짓점 (0, 0)
        //          오른쪽 위 꼭짓점 (w, h)
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int xLine = w - x;
        int yLine = h - y; 

        // x, xLine, y, yLine 4가지 거리 중 제일 작은 값 출력
        int minX = Math.min(x, xLine); // x축의 최소거리
        int minY = Math.min(y, yLine); // y축의 최소거리

        System.out.println(Math.min(minX, minY));

    }
}
