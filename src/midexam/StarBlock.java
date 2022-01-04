package midexam;

import java.util.Scanner;

public class StarBlock {
    public static void main(String[] args) {
        System.out.println("Please enter two numbers from 0-20 which the first number is smaller than the second number!");
        Scanner scanner = new Scanner(System.in);
        String f = scanner.next();
        String s = scanner.next();
        System.out.println("Your first number is " + f);
        System.out.println("Your second number is " + s);
        int first = Integer.parseInt(f);
        int second = Integer.parseInt(s);
        for(int i = 0; i < 8; i++){
            for (int j = 0; j < 21; j++){
                if ((i >= 0 && i < 8) && (j+1 >= first && j < second)){
                    System.out.print("*");
                } else{
                    System.out.print("0");
                }
            }
            System.out.println(" ");
        }
    }
}
