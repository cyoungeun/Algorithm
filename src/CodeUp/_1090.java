package CodeUp;

import java.util.Scanner;

public class _1090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int r = scanner.nextInt();
        int n = scanner.nextInt();
        long nCount = 0;

        if(a <= 10 && r <= 10 && n <= 10){
            for(int i = 0; i < n; i++){
                nCount = (long) (a * (Math.pow(r, i)));
            }
            System.out.println(nCount);
        }
    }
}
