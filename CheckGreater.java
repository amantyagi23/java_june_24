import java.util.Scanner;

public class CheckGreater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input for a");
        int a = scanner.nextInt();

        System.out.println("Enter Input for b");
        int b = scanner.nextInt();

        System.out.println("Enter Input for c");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("a");
        } else {
            if (b > c) {
                System.out.println("B");
            } else {
                System.out.println("c");
            }
        }
    }
}
