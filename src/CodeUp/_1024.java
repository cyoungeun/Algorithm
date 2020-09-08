package CodeUp;

import java.util.Scanner;

public class _1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        if(word.length() <= 20){
            for (int i=0; i<=word.length()-1; i++){
                System.out.println("\'"+word.charAt(i)+"\'");
            }
        }
    }
}
