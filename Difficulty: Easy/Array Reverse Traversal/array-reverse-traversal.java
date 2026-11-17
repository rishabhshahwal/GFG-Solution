class Solution {
    public static void arrayTraversalReverse(int arr[], int n) {
        // Traverse the array from the last index down to 0
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}