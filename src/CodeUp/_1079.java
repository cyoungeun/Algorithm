package CodeUp;

import java.util.Scanner;

public class _1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            char c = scanner.next().charAt(0);

            // 'q'입력 시 종료
            if(c == 'q'){
                System.out.println(c);
                break;
            }
            System.out.println(c);
        }
    }
}
