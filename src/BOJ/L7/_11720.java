package BOJ.L7;

import java.util.Scanner;

public class _11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String nNum = scanner.next();
        int sum = 0;

        // 문자열의 원소 0 ~ n 까지 각 원소 누적 합 구하기
        for (int i = 0; i < n; i++) {

            // charAt() 메서드는 해당 문자의 아스키코드 값을 반환함
            sum += nNum.charAt(i) - '0'; // -'0' or -48 해줘야 입력받은 값 사용가능
        }
        System.out.println(sum);
    }
}
