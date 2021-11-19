import java.util.Scanner;

public class Solution_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Pair<Integer, Integer> pair = minAndMax(arr, n);
        System.out.print(pair.min + "  " + pair.max);

        //resource must be closed.
        sc.close();
    }

    //    : good to have static method to avoid creating an object
    public static Pair<Integer, Integer> minAndMax(int[] arr, int n) {
        //Alert : we haven't considered one corner case
        // what to return if array have only one element ?

        if (n == 0) {
            return new Pair<>(arr[0], arr[0]);
        }
        Pair<Integer, Integer> p = new Pair<>(arr[0], arr[0]);

        for (int i = 1; i < n; i++) {
            if (arr[i] < p.min) {
                p.min = arr[i];
            }

            if (arr[i] > p.max) {
                p.max = arr[i];
            }
        }

        /* Improvement :  same logic as first solution but loops run (n-1)/2 this time
        int loop = 0;
        for (int i = 1, j = n - 1; i < j; i++,j--) {
            p.min = Math.min(Math.min(arr[i],arr[j]), p.min);
            p.max = Math.max(Math.max(arr[i],arr[j]), p.max);
        }
         */
        return p;
    }

    private static class Pair<T, K> {
        public T min;
        public K max;

        Pair(T a, K b) {
            this.min = a;
            this.max = b;
        }
    }
}
