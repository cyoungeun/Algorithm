package BOJ.L0;

import java.util.Scanner;

public class _10250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            int h = scanner.nextInt(); // 각각 호텔의 층 수 h
            int w = scanner.nextInt(); // 각 층에 w개의 방
            int n = scanner.nextInt(); // n번째 손님

            // 방 번호 형태 yxx or yyxx
            int nNum = 1; // n번째 손님 찾아줄 변수
            int xx = 1; // 호수

            while (xx <= w) { // 호수가 각 층 w개의 방 이하일 경우
                for(int y = 1; y <= h; y++) { // 1 ~ h층 까지 반복

                    if(nNum == n){
                        System.out.printf("%d%02d \n", y, xx); // 배정 될 방 번호
                    }

                    if(y == h) { // 입력받은 h층과 같아지면 호수+1
                        xx++;
                    }

                    nNum++; // 배정 될 때 마다 +1
                }
            }
        }

    }
}
