package BOJ.L0;

import java.util.Scanner;

public class _3053 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 반지름 r
        int r = scanner.nextInt();

        double circleU = r * r * Math.PI; // 유클리드 기하학의 원의 넓이
        double circleT = r * r * 2; // 택시 기하학의 원의 넓이

        System.out.printf("%.6f \n", circleU);
        System.out.printf("%.6f", circleT);

    }
}
