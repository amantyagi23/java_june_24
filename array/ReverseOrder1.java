
public class ReverseOrder1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int temp[] = new int[arr.length];
        int n = arr.length;

        System.out.println("before reverse order logic ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");

        for (int i = arr.length - 1; i >= 0; i--) {
            temp[n - i - 1] = arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

        System.out.println("after reverse order logic");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");
    }
}
