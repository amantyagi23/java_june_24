public class RemoveElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 1, 6, 7, 2, 1, 6, 8, 2, 3, 1, 1, 5, 7 };
        int n = 3;

        int count = 0;

        System.out.println("before Removing element");
        System.out.println();
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }

        int result[] = new int[arr.length - count];
        int y = 0;

        for (int i = 0; i < arr.length; i++) {
            if (n != arr[i]) {
                result[y] = arr[i];
                y++;
            }
        }

        System.out.println();
        System.out.println("After Removing");
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print("]");

    }
}
