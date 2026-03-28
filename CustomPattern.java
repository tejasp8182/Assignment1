package in.study;
public class CustomPattern {
    public static void main(String[] args) {

        int n = 14; // total width (stars in first/last row)

        // Top full line
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Decreasing part
        for (int i = 7 - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Increasing part
        for (int i=2; i < 7; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Last full line (14 stars)
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}