
package array;

import java.util.Scanner;

/**
 * ArraySyntax
 */
public class ArraySyntax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = 10;
        // pre declare

        // int n = 7;

        // n = 6;
        // post declare

        int arr[] = { 3, 6, 1, 8, 0, 6, 11, 17, 6 };

        System.out.println(arr.length);
        // pre declare
        // cap or length = 9
        // 0 to length -1 = 0 to 8

        // int post[] = new int[7];

        // new = new memory allocation
        // data_type variable_name[] = new data_type[array_cap];
        // post declare

        // if we store any value in an array its alwalys store with it index value
        // System.out.println(arr[0]);

        // for (int i = 0; i < 9; i++) {
        // System.out.println(arr[i]);
        // }

        int post[] = new int[7];

        System.out.println(post.length);

        post[0] = sc.nextInt();
        post[1] = sc.nextInt();
        post[2] = sc.nextInt();
        post[3] = sc.nextInt();

        // for (int i = 0; i < 7; i++) {
        // System.out.println(post[i]);
        // }

    }
}