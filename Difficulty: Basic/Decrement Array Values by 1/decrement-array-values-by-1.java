class Solution {
    public static int[] decrementArray(int[] arr, int n) {
        // Iterate through each element and decrement by 1
        for (int i = 0; i < n; i++) {
            arr[i] -= 1;
        }
        return arr;
    }
}