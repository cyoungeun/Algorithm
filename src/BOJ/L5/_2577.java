package BOJ.L5;

import java.util.Scanner;

public class _2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int abc = a * b * c;
        String abcN = Integer.toString(abc); // 문자열로 변경

        for(int i = 0; i < 10; i++) { // 0 ~ 9 숫자가 몇번 나왔는지
            int cnt = 0;
            for(int j = 0; j < abcN.length(); j++) {
                if((abcN.charAt(j) - '0') == i) { // a*b*c 값의 숫자 한 개씩 추출한 값이 같을 때
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
