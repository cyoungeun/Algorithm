package BOJ.L10;

import java.util.Scanner;

public class _3009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x[] = new int[3];
        int y[] = new int[3];

        // 나머지 네번째 x, y 값 좌표
        int x4 = 0, y4 = 0;

        for(int i = 0; i < 3; i++) { // 세 점의 (x,y)좌표 입력
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        // 주어진 세 x 좌표 중 두개의 값이 같을 때 그 남은 값이 네번째 x좌표 값
        if(x[0] == x[1]) {
            x4 = x[2];
        }else {
            x4 = (x[1] == x[2]) ?  x[0] : x[1];
        }

        // 주어진 세 y 좌표 중 두개의 값이 같을 때 그 남은 값이 네번째 x좌표 값
        if(y[0] == y[1]) {
            y4 = y[2];
        }else {
            y4 = (y[1] == y[2]) ?  y[0] : y[1];
        }

        System.out.println(x4 +" "+ y4);
    }
}
