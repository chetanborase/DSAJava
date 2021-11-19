import java.util.Scanner;

public class Solution_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        arr = new Solution_1().reverseArray(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }

        //resource must be closed.
        sc.close();
    }

    //    : good to have static method to avoid creating an object
    int[] reverseArray(int[] arr, int n) {
        //GoodPractice := always check corner case
        if (n <= 2) {
            return arr;
        }

        for (int i = 0, j = n -1 ; i < j; i++, j--) {
            //swap ith and jth element
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            /*
                or we can also swap without using third variable refer below code snippet.

             arr[i] +=  arr[j];
             arr[j] =  arr[i] - arr[j];
             arr[i] =  arr[i] - arr[j];
             */
        }

        return arr;
    }
}
