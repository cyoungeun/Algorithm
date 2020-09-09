package CodeUp;

import java.util.Scanner;

public class _1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String clock = scanner.next();
        String[] a = clock.split("\\:");
        
        int h = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        int s = Integer.parseInt(a[2]);
        
        System.out.printf("%d", m);
    }
}




