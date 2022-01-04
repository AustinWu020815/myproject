package com.austin;

import java.util.Random;
import java.util.Scanner;

public class quicktest2 {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        System.out.println(secret);
        System.out.println("please enter a number from 1-100: ");
        int min = 1;
        int max = 100;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i<5;i++){
            String s = scanner.next();
            int num = Integer.parseInt(s);
            if (num < secret){
                min = num;
                System.out.println("please enter a num from " + min + " to " + max);
            }else if (num > secret){
                max = num;
                System.out.println("please enter a num from " + min + " to " + max);
            }else{
                System.out.println("you win, the number is " + secret);
                break;
            }
            if (num!= secret && i ==4){
                System.out.println("you lose, the number is " + secret);
                break;
            }
            //5:31
        }
    }
}
