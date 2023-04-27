package BOJ.L6;

import java.util.Scanner;

public class _1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int arr[] = new int[26]; // 알파벳 26개 배열

        for(int i = 0; i < word.length(); i++) {
            char alpha = word.charAt(i);

            if(alpha >= 'A' && alpha <= 'Z') { // 대문자 범위
                arr[alpha - 'A']++;
            }else{ // 소문자 범위
                arr[alpha - 'a']++;
            }
        }

        char c = '?';
        int max = 0; // 단어에서 가장 많이 사용된 알파벳 찾는 변수

        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                c = (char)(i + 'A'); // 대문자로 출력
            }else if(max == arr[i]) {
                c = '?'; // 가장 중복 많은 알파벳이 여러 개 존재하는 경우 '?'를 출력
            }
        }
        System.out.println(c);
    }
}
