package stars;

public class HalfXshape {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (((i * 2 == j) && (j>=0 && j<=9)) || ((19 - (i * 2) == j) && (j>=0 && j<=9))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}