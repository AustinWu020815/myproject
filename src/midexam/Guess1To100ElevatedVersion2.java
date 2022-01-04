package midexam;

import java.util.Random;
import java.util.Scanner;

public class Guess1To100ElevatedVersion2 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        System.out.println(secret);
        int min = 1;
        int max = 100;
        System.out.println("Please enter a number from 1-100:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String s = scanner.next();
            System.out.println("User:" + s);
            int num = Integer.parseInt(s);
            if (num > secret && num <= 100 && i < 4) {
                max = num;
                System.out.println("Please enter a number from " + min + " to " + num);
            }else if (num < secret && num >= 1 && i < 4) {
                min = num;
                System.out.println("Please enter a number from " + num + " to " + max);
            }else if (num == secret){
                System.out.println("You win, the number is " + secret);
                i = 5;
            }else if (num != secret && i == 4) {
                System.out.println("You lose, the number is " + secret);
            } else if (num < 1 || num > 100) {
                System.out.println("Error, out of range!");
                System.out.println(" ");
                System.out.println("Please enter a number from 1-100:");
                if (i == 0) {
                    i = 0;
                }
                if (i == 1){
                    i = 0;
                }
                if (i == 2){
                    i = 1;
                }
                if (i == 3){
                    i = 2;
                }
                if (i == 4){
                    i = 3;
                }
            }
        }
    }
}

