import java.util.Scanner;

public class Solution_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //size of array
        int k = sc.nextInt(); //size of array

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        rotateArray(arr, n, k);

        for (int a : arr) {
            System.out.print(a);
        }
        //resource must be closed.
        sc.close();
    }

    //Space Complexity = O(1),Time Complexity = O(n*n)
    public static void rotateArray(int[] arr, int n, int k) {
        while (k > 0) {
            for (int i = 0; i < n; i++) {
                int temp = arr[(i + 1) % n];
                arr[i] = arr[(i + 1) % n];
                arr[(i + 1) % n] = temp;
            }
            k--;
        }
    }

    //Space Complexity = O(n*n),Time Complexity = O(n)
    public static void rotateArray_2(int[] arr, int n, int k) {
        int temp;
        for (int i = 0; i < n; i++) {
            int index = (i + k) % n;
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}