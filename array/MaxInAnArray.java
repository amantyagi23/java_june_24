package array;

public class MaxInAnArray {
    public static void main(String[] args) {
        int arr[] = { 4, 7, 1, -3, 9, -7, 12, 16, 9, 0 };

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("max value : " + max);
    }
}
