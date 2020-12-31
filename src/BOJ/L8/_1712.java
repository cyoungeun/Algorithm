package BOJ.L8;

import java.util.Scanner;

public class _1712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 손익분기점 : 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점
        // 총 수입(판매비용) > 총 비용(= 고정비용+가변비용)

        int a = scanner.nextInt(); // 고정비용
        int b = scanner.nextInt(); // 가변비용 (한 대의 노트북 생산 비용)
        int c = scanner.nextInt(); // 책정된 노트북 가격 (판매비용)

        // 판매 수(n)
        // 손익분기점 = (판매비용 * 판매 수) > 고정비용 + (가변비용 * 판매 수)로 정의 가능
        // a + nb < nc

        // 판매비용 * 판매 수 = 총 수입 임을 알 수 있음
        // nc = a + nb

        // n = a / (c - b) => 총 비용과 총 수익이 같아지는 지점

        if(c <= b) { // 판매비용이 가변비용보다 작거나 같을 경우엔 손익분기점 불가
            System.out.println(-1);
        }else {
            System.out.println(a / (c - b) + 1); // 같아지는 지점에서 +1을 해줘야 이익이 나는 지점이 됨
        }
    }
}
