package CodeUp;

import java.util.Scanner;

public class _1092 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int day = 1;
        if(a <= 100 && b <= 100 && c <= 100){
            while (day % a != 0 || day % b != 0 || day % c != 0){
                day++;
            }
            System.out.println(day);
        }
    }
}
