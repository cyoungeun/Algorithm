package BOJ.L2;

import java.util.Scanner;

public class _2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int dice3 = scanner.nextInt();
        int reward = 0;
        int same = 0;
        int max = 0;

        if(dice1 != dice2 && dice2 != dice3 && dice1 != dice3) { // 모두 다른 수
            if(dice1 > dice2 && dice1 > dice3) {
                max = dice1;
            }else if(dice2 > dice1 && dice2 > dice3) {
                max = dice2;
            }else{
                max = dice3;
            }

            reward = max * 100;
            System.out.println(reward);

        }else if(dice1 == dice2 && dice2 == dice3 && dice1 == dice3) { // 모두 같은 수
            same = dice1;
            reward = 10000 + (same * 1000);
            System.out.println(reward);

        }else { // 두개만 같은 수
            if(dice1 == dice2 && dice1 != dice3 && dice2 != dice3){
                same = dice1;
            }else if(dice2 == dice3 && dice1 != dice3 && dice1 != dice2){
                same = dice2;
            }else if(dice3 == dice1 && dice1 != dice2 && dice3 != dice2){
                same = dice3;
            }
            reward = 1000 + (same * 100);
            System.out.println(reward);

        }
    }
}
