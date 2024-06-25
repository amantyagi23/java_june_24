import java.util.Scanner;

/**
 * PrintAcc
 */
public class PrintAcc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        while (i != n) {
            System.out.print(i);
            i++;
        }
    }
}