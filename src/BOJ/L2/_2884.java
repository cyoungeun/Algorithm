package BOJ.L2;

import java.util.Scanner;

public class _2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        if(m >= 45){
            System.out.printf("%d ", h);
            System.out.printf("%d", m - 45);
        }else if (h < 1 && m < 45){
            System.out.printf("%d ", 23);
            System.out.printf("%d", 60 + m - 45); // +15
        }else if (m < 45){
            System.out.printf("%d ", h - 1);
            System.out.printf("%d", 60 + m - 45); // +15
        }
    }
}
