import java.util.Scanner;

public class Solution_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Pair<Integer, Integer> pair = secondMinAndMax(arr, n);

        System.out.print(pair.min + "  " + pair.max);

        //resource must be closed.
        sc.close();
    }

    //    : good to have static method to avoid creating an object
    public static Pair<Integer, Integer> secondMinAndMax(int[] arr, int n) {
        //Alert : we haven't considered one corner case
        // what to return if array have only one element ?

        if (n == 0) {
            return new Pair<>(arr[0], arr[0]);
        }

        Pair<Integer, Integer> first = new Pair<>(arr[0], arr[0]);
        Pair<Integer, Integer> second = new Pair<>(arr[0], arr[0]);

        for (int i = 1; i < n; i++) {
//            In every iteration,
//            find first min and max from array
//            find compare with second min and max value

            if (first.min < arr[i]){
                second.min = first.min;
                first.min = arr[i];
            }

            if (first.max > arr[i]){
                second.max = first.max;
                first.max = arr[i];
            }
        }

        /*
         * Improvement : same logic as first solution but loops run (n-1)/2 this time

             int loop = 0;
        for (int i = 1, j = n - 1; i < j; i++, j--) {
            int currentMin = Math.min(arr[i], arr[j]);
            int currentMax = Math.max(arr[i], arr[j]);

            if (first.min < currentMin){
                second.min = first.min;
                first.min = currentMin;
            }

            if (first.max > currentMax){
                second.max = first.max;
                first.max = currentMax;
            }
        }
         */

        return second;
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
