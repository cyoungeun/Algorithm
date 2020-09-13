package CodeUp;

import java.util.Scanner;

public class _1076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char alphabet = scanner.next().charAt(0);
        char alphabet1 = 'a';
        do {
            System.out.println(alphabet1);
            alphabet1++;
        }while (alphabet1 <= alphabet);
    }
}
