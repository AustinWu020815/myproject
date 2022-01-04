package myproject;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("Please choose a drink!");
        System.out.println("There are 1.milk tea, 2.black tea, 3.green tea");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int choice = Integer.parseInt(s);
        int bill = 0;
        int pay = 0;
        int total = 0;
        switch (choice){
            case 1:
                System.out.println("1.milk tea, your bill is $35");
                bill = 35;
                break;
            case 2:
                System.out.println("2.black tea, your bill is $32");
                bill = 32;
                break;
            case 3:
                System.out.println("3.green tea, your bill is $25");
                bill = 25;
                break;
            default:
                System.out.println("Error!");
                break;
        }
        boolean end = false;
        while (!end){
            System.out.println("Please enter your coins (1/5/10/20/50)!");
            String p = scanner.next();
            int coin = Integer.parseInt(p);
            switch (coin){
                case 1:
                case 5:
                case 10:
                case 20:
                case 50:
                    System.out.println("Pay $" + coin);
                    pay = pay + coin;
                    total = pay;
                    break;
                case 0:
                    System.out.println("Return back your money: $" + pay);
                    System.out.println("WELCOME NEXT TIME!!");
                    end = true;
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
            int change = pay - bill;
            int remain = bill - pay;
            if (pay > bill){
                System.out.println("Total pay: $" + total);
                System.out.println("The change is $" + change);
                System.out.println("THANKS FOR BUYING!!");
                end = true;
        }else if (pay < bill && coin != 0){
                System.out.println("$" + remain + " remaining!   Total:" + total);
            }else if (coin != 0){
                System.out.println("That's it!");
                System.out.println("THANKS FOR BUYING!!");
                end = true;
            }
        }
    }
}
