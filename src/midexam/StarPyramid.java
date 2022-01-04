package midexam;

public class StarPyramid {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 17; j++) {
                if (j>=(8-i) && j<=(8+i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
