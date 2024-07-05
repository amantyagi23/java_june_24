package array;

import java.util.Scanner;

/**
 * ArrayInput
 */
public class ArrayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cap of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter value index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print("]");

    }
}