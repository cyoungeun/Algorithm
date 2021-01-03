package BOJ.L8;

import java.util.Scanner;

public class _2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 (1)        - 1개
        // 6 (2~7)      - 2개
        // 12 (8~19)    - 3개
        // 18 (20~37)   - 4개
        // 24 (28~61)   - 5개
        // 30 (62~  )   - 6개
        // ...

        int n = scanner.nextInt();
        int count = 1; // 최소 개수의 방 구하는 변수
        int hexa = 6; // 6각형
        int range = 1; // 범위

        while(true) {
            // 입력 값보다 범위 값이 작거나 같다면 종료
            if(n <= range) {
                break;
            }

            range += hexa * count; // 해당 범위의 값을 6씩 증가
            count++; // 방 개수 증가
        }

        // 해당 범위에 있는 방 개수 출력
       System.out.println(count);
    }
}
