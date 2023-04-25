package BOJ.L2;

import java.util.Scanner;

public class _2525 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int time = scanner.nextInt();

        int tempM = m + time;
        if(tempM >= 60) { // 분이 60 넘어갈 때
            tempM = tempM % 60;
            int tempH = h + ((m + time)/60);
            if(tempH >= 24){ // 23시 59분 넘어가면 0시로 초기화
                System.out.println((tempH % 24) + " " + tempM);
            }else{
                System.out.println(tempH + " " + tempM);
            }
        }else {
            System.out.println(h + " " + tempM);
        }

    }
}
