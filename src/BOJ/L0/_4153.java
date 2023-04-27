package BOJ.L0;

import java.util.Scanner;

public class _4153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            // 세 변의 길이 입력
            int tri1 = scanner.nextInt();
            int tri2 = scanner.nextInt();
            int tri3 = scanner.nextInt();

            // 세 변의 길이 모두 0 입력 시 종료
            if(tri1 == 0 && tri2 == 0 && tri3 == 0) {
                break;
            }

            // 피타고라스 정리 활용 (𝑎² = 𝘣² + 𝘤²)
            int t1 = (int)Math.pow(tri1, 2);
            int t2 = (int)Math.pow(tri2, 2);
            int t3 = (int)Math.pow(tri3, 2);

            // 직각삼각형이면 right, 아니면 wrong 출력
            if(t1 + t2 == t3) {
                System.out.println("right");

            }else if(t1 + t3 == t2){
                System.out.println("right");

            }else if(t2 + t3 == t1) {
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }

    }
}
