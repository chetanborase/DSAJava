public class Solution_14 {
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int a[], int n) {

        int[] sumArray = new int[n];
        long max = sumArray[0] = a[0];
        for (int i = 1; i < n; i++) {
            sumArray[i] = sumArray[i - 1] + a[i];
            sumArray[i] = Math.max(sumArray[i], a[i]);
            max = Math.max(max,sumArray[i]);
        }

        return max;
    }
}
