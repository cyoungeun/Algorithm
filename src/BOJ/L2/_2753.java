package BOJ.L2;

import java.util.Scanner;

public class _2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        // 윤년
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
