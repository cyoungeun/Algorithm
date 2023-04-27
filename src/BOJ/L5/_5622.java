package BOJ.L5;

import java.util.Scanner;

public class _5622 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dial = scanner.nextLine();
        int time = 0;

        for(int i = 0; i < dial.length(); i++) {
            char c = dial.charAt(i); // 문자열 dial 문자 c로 변환

            // 숫자 1을 걸려면 총 2초가 필요
            // 숫자 증가할 때마다 1초 증가
            if(c == 'A' || c == 'B' || c == 'C') { // 숫자 2 - A, B, C
                time += 3;
            }else if (c == 'D' || c == 'E' || c == 'F') { // 숫자 3 - D, E, F
                time += 4;
            }else if (c == 'G' || c == 'H' || c == 'I') { // 숫자 4 - G, H, I
                time += 5;
            }else if (c == 'J' || c == 'K' || c == 'L') { // 숫자 5 - J, K, L
                time += 6;
            }else if (c == 'M' || c == 'N' || c == 'O') { // 숫자 6 - M, N, O
                time += 7;
            }else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') { // 숫자 7 - P, Q, R, S
                time += 8;
            }else if (c == 'T' || c == 'U' || c == 'V') { // 숫자 8 - T, U, V
                time += 9;
            }else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') { // 숫자 9 - W, X, Y, Z
                time += 10;
            }
        }

        System.out.println(time);
    }
}
