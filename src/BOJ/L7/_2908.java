package BOJ.L7;

import java.util.Scanner;

public class _2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 입력받은 숫자를 문자열로 변환
        String numA = String.valueOf(a);
        String numB = String.valueOf(b);

        // 문자열 정수형으로 형변환
        int A = Integer.parseInt(reverseStr(numA));
        int B = Integer.parseInt(reverseStr(numB));
        System.out.print(A > B ? A : B); // 삼항연산자로 A, B값 비교하여 큰 수 출력
    }

    // 역순으로 변환해주는 reverseStr 사용자 정의 함수 구현
    public static String reverseStr(String n) {
        // reverse() : 저장된 문자열 역순으로 변환
        // toString() : StringBuffer 타입을 문자열로 반환시키기 위해 사용
        return (new StringBuffer(n).reverse().toString());
    }
}
