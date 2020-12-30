package BOJ.L7;

import java.util.Scanner;

public class _1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 단어의 개수
        int count = n; // 그룹 단어의 개수

        for(int i = 0; i < n; i++) {
            int groupChk[] = new int[26]; // 그룹단어 체크 배열 선언
            String word = scanner.next();

            for (int j = 1; j < word.length(); j++) {
                groupChk[word.charAt(0) - 'a'] = 1; // 첫번째 문자 1로 초기화

                // 앞 문자와 현재 문자가 같지 않다면
                if (word.charAt(j - 1) != word.charAt(j)) { 
                    if(groupChk[word.charAt(j) - 'a'] == 1) { // 해당 문자가 이전에 나온적 있는 경우
                        count -= 1; // 그룹단어가 아니므로 -1
                        break;
                    }else { // 해당 문자가 이전에 나온적 없는 경우
                        groupChk[word.charAt(j) - 'a'] = 1; // 그룹단어 이므로 groupChk 배열 현재 단어 위치 1로 변경
                    }
                }
            }
        }
        System.out.println(count);
    }
}
