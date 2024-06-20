import java.util.Scanner;

public class CheckMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter User Marks : ");
        int mark = sc.nextInt();

        if (mark > 85) {
            System.out.println("A");
        } else if (mark <= 85 && mark > 75) {
            System.out.println("B");
        } else if (mark <= 75 && mark > 65) {
            System.out.println("C");
        } else if (mark <= 65 && mark > 45) {
            System.out.println("D");
        } else if (mark <= 45 && mark > 30) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}
