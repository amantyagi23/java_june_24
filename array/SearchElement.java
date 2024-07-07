import java.util.Scanner;

/**
 * SearchElement
 */
public class SearchElement {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 12, 52, 32, 1, 0, -2 };

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean flag = false;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                flag = true;
                index = i;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Present at index : " + index);

        } else {
            System.out.println("Not Present ");
        }
    }
}