package BOJ.L8;

import java.util.Scanner;
import java.math.BigInteger;

public class _10757 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수형 long 타입의 범위를 초과한 큰 수 출력 방법 = BigInteger

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        BigInteger sum = a.add(b); // a+b

        System.out.println(sum);

    }
}
