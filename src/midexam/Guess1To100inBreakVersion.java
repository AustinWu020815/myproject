package midexam;

import java.util.Random;
import java.util.Scanner;

public class Guess1To100inBreakVersion {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        System.out.println(secret);
        System.out.println("Please enter a number from 1-100:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String s = scanner.next();
            System.out.println("User:" + s);
            int num = Integer.parseInt(s);
            if (num > secret) {
                System.out.println("Please enter a number from 1 to " + s);
            }
            if (num < secret) {
                System.out.println("Please enter a number from " + s + " to 100");
            }
            if (num == secret) {
                System.out.println("You win, the number is " + secret);
                break;
            }
            if (num != secret && i == 4) {
                System.out.println("You lose, the number is " + secret);
            }
        }
    }
}
