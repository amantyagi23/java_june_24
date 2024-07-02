package patterns;

public class Pattern16 {

    public static void main(String[] args) {
        int n = 5;

        // for (int row = n; row >= 1; row--) {
        // for (int col = 1; col <= row; col++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}