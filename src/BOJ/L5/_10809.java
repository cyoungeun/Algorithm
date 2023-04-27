package BOJ.L5;

import java.util.Scanner;

public class _10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String regExpLower = "^[a-z]*$"; // 알파벳 소문자만 입력가능한 정규표현식

        int alphaArr[] = new int[26];

        for(int i = 0; i < alphaArr.length; i++) {
            alphaArr[i] = -1; // 알파벳 배열 -1로 초기화
        }

        if(s.length() < 101 && s.matches(regExpLower)) { // 문자열 길이는 100 이하, 알파벳 소문자만 입력가능
            for(int i = 0; i < s.length(); i++) {
                char alpha = s.charAt(i); // 문자열 s를 charAt()으로 잘라 문자 alpha로 변환

                // -'a' or -97 해줘야 입력받은 값 사용가능
                if(alphaArr[alpha - 'a'] == -1) { // -1일 경우 배열 원소 값 변경
                    alphaArr[alpha - 'a'] = i;
                }
            }

            // 알파벳 배열 전체 출력
            for (int i : alphaArr) {
                System.out.printf(i + " ");
            }
        }

    }
}
