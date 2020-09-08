package CodeUp;

import java.util.Scanner;

public class _1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String f = scanner.nextLine();
        String []a = f.split("\\.");
        if(a.length > 1){
            System.out.println(a[0]);
            System.out.println(a[1]);
        }
    }
}
