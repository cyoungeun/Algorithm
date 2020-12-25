package BOJ.L7;

import java.util.Scanner;

public class _2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // 테스트 케이스 갯수 선언

        for(int i = 0; i < t; i++) {
            int r = scanner.nextInt(); // 반복 갯수 선언
            String s = scanner.next(); // 입력받을 문자열

            char arr[] = new char[s.length()]; // 입력받은 문자열을 하나씩 나눠 담을 문자 배열

            for(int j = 0; j < s.length(); j++) {
                char repeat = s.charAt(j); // 문자열 s를 charAt()으로 잘라 문자 repeat으로 변환
                arr[j] = repeat;
                for (int k = 0; k < r; k++) {
                    System.out.print(arr[j]); // 반복 개수 만큼 문자가 저장되어있는 배열에서 출력
                }
            }
            System.out.println();
        }
    }
}
