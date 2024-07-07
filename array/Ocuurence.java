public class Ocuurence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 1, 6, 7, 2, 1, 6, 8, 2, 3, 1, 1, 5, 7 };

        int n = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }

        System.out.println("Occurence of " + n + " : " + count);
    }
}