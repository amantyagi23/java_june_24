import java.util.Scanner;

public class CheckLEapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year");

        int year = sc.nextInt();

        if (year % 4 == 0) {

            System.out.println("Leap Year");

        } else {
            System.out.println("Not A Leap Year");
        }
    }
}
