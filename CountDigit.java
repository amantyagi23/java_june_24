import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Value Of N : ");
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            count += 1;

            n = n / 10;
        }

        System.out.println("Count is " + count);

    }
}
