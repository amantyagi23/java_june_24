public class AddTwoArr {
    public static void main(String[] args) {
        int arr1[] = { 9, 2, 5 };
        int arr2[] = { 4, 5, 6 };

        int result[] = new int[arr1.length + 1];

        int carry = 0;

        for (int i = arr1.length - 1; i >= 0; i--) {
            int sum = arr1[i] + arr2[i] + carry;
            if (sum > 9) {
                carry = sum / 10;
            } else {
                carry = 0;
            }
            result[i] = sum % 10;

        }

        System.out.println();
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print("]");

    }
}
