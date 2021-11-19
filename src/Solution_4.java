import java.util.Arrays;
import java.util.Scanner;

public class Solution_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //size of array
        int k = sc.nextInt(); //size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Pair<Integer, Integer> pair = kthMinAndMax(arr, n, k);

        System.out.print(pair.min + "  " + pair.max);

        //resource must be closed.
        sc.close();
    }

    //    : good to have static method to avoid creating an object
    public static Pair<Integer, Integer> kthMinAndMax(int[] arr, int n, int k) {
        //Note : array is reference type in java
        Arrays.sort(arr);
        return new Pair<>(arr[k],arr[n-k]);
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
