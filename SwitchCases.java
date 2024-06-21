import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("You Press 1");
                break;

            case 2:
                System.out.println("You Press 2");
                break;

            default:
                System.out.println("Wrong Input");
                break;
        }
    }
}
