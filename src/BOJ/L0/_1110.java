package BOJ.L0;

import java.util.Scanner;

public class _1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 입력받는 수
        int num = n;
        int i = 0; // 사이클 길이

        while(true){
            int n1 = n / 10; 
            int n2 = n % 10;
            int n3 = n1 + n2;
            n = ((n2) * 10) + ((n3) % 10);
            i++;

            if(num == n){
                break;
            }
        }
        System.out.println(i);
    }
}
