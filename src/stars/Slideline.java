package stars;

import org.w3c.dom.ls.LSOutput;

public class Slideline {
    public static void main(String[] args) {
        for (int  i = 0; i < 10; i++){
            for (int j = 0; j < 20; j++){
                if (i * 2 == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
