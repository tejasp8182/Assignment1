package in.study;

public class DoublePyramid {
    public static void main(String[] args) {

        int n = 6;

        for (int i = 1; i <= n; i++) {

            // Left pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // Right pyramid
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}