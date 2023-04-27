package BOJ.L3;

import java.util.Scanner;

public class _10951 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()){ // int형 이외의 값 입력받았을 때 종료
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a + b);
        }

    }
}
