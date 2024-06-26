import java.util.Scanner;

/**
 * ArmStrong
 */
public class ArmStrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int copy = n;
        int count = 0;

        while (n != 0) {
            count++;
            n = n / 10;
        }
        n = copy;
        int arm = 0;
        while (n != 0) {
            int a = n % 10;
            arm = arm + (int) Math.pow(a, count);
            n = n / 10;
        }

        if (arm == copy) {
            System.out.println("Arm Strong");
        } else {
            System.out.println("Not A Arm Strong");
        }

    }
}