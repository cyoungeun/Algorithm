package CodeUp;

import java.util.Scanner;

public class _1069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);

        switch (grade)
        {
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }
}
