class Solution {
    public static int findMean(int[] arr) {
        int n = arr.length;
        long sum = 0; // Use long to prevent integer overflow for large arrays

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return (int) (sum / n); // Integer division automatically computes the floor value
    }
}