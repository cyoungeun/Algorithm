package BOJ.L8;

import java.util.Scanner;

public class _1193 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int line = 1; // 대각선 line 번호
        int count = 0; // 각 대각선 line 의 최종 개수

        while (true) {
            count = line * (line+1) / 2; // 각 대각선 개수는 등차수열을 이룸 => n(n+1) / 2

            if(x <= count) {
                int num1 = line - (count - x);
                int num2 = 1 + (count - x);

                if (line % 2 == 0) { // line 번호가 짝수
                    System.out.print(num1 + "/" + num2);
                    break;
                } else { // line 번호가 홀수
                    System.out.print(num2 + "/" + num1);
                    break;
                }
            }

            line++;
        }
    }
}
