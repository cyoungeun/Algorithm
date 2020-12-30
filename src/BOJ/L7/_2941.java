package BOJ.L7;

import java.util.Scanner;

public class _2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String cro[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="}; // 변경한 크로아티아 알파벳 배열

        for(int i = 0; i < cro.length; i++) {
            if(s.contains(cro[i])){ // 크로아티아 알파벳이 입력한 문자열에 포함되어 있으면
                s = s.replace(cro[i], "*"); // 크로아티아 알파벳 *로 치환
            }
        }

        // 크로아티아 알파벳 개수 출력
        System.out.println(s.length());
    }
}
