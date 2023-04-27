package BOJ.L5;

import java.util.Scanner;

public class _1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int count = 0; // 공백 개수 구하는 변수
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') { // 문자에서 공백 개수 세기
                count++;
            }
        }

        count++; // 단어의 개수 = 공백 개수 +1
        if(s.charAt(0) == ' ') { // 문자열 맨 앞자리 공백 일 경우
            count--;
        }
        if(s.charAt(s.length() - 1) == ' ') { // 문자열 맨 뒷자리 공백 일 경우
            count--;
        }

        System.out.println(count);
    }
}
