import java.util.Scanner;

public class Solution_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int a : arr) {
            System.out.print(a);
        }
        //resource must be closed.
        sc.close();
    }

    public static int[] separatePositiveAndNegative(int[] arr, int n) {
        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] < 0) {
                i++;
                continue;
            }
            if (arr[j] > 0) {
                j--;
                continue;
            }

            //now swap
            arr[i] += arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];

            i++;
            j--;
        }

        return arr;
    }
}