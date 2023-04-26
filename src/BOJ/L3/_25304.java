package BOJ.L3;

import java.util.Scanner;

public class _25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(); // 영수증에 적힌 총 금액
        int n = scanner.nextInt(); // 구매한 물건의 종류 수

        int price = 0; // 계산한 총 금액

        for(int i = 0; i < n; i++) {
            int a = scanner.nextInt(); // 각 물건의 가격 a
            int b = scanner.nextInt(); // 각 물건의 개수 b

            price += (a * b);
        }

        if(x == price) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


    }
}
