import java.util.Scanner;

public class Solution_5 {

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

    public static int[] sortArray(int[] arr, int n) {
        int zero = 0, one = 0, two = 0;
        for (int i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0 -> zero++;
                case 1 -> one++;
                case 2 -> two++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i < zero) {
                arr[i] = 0;
            } else if (i > zero && i < (zero + one)) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }

        return arr;
    }
}
