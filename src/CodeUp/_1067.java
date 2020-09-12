package CodeUp;

import java.util.Scanner;

public class _1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if(a > 0){
            System.out.println("plus");
        }else if(a < 0){
            System.out.println("minus");
        }

        if(a % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
