package in.study;
public class HollowSquare {
    public static void main(String[] args) {

        int n = 14; // height

        // Top decreasing pattern (first half)
        for (int i = 0; i < n / 2; i++) {

            // Left stars
            for (int j = 0; j < n/2 - i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j < n/2 - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Middle vertical borders
        for (int i = 0; i < n/2 - 1; i++) {

            System.out.print("*"); // left border

            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }

            System.out.println("*"); // right border
        }

        // Bottom full line
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}