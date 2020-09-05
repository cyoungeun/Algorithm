package CodeUp;

import java.util.Scanner;

public class _1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regNum = scanner.next();
        String[] a = regNum.split("\\-");
        int regN1 = Integer.parseInt(a[0]);
        int regN2 = Integer.parseInt(a[1]);
        System.out.printf("%06d%07d", regN1, regN2);
    }
}
