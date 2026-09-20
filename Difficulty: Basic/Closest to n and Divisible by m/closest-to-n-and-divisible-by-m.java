class Solution {
    public static int closestNumber(int n, int m) {

        // Find the quotient
        int q = n / m;

        // Two possible multiples of m
        int num1 = q * m;
        int num2;

        // If n and m have same sign, next multiple is (q + 1) * m
        // Otherwise, next multiple is (q - 1) * m
        if ((n < 0) == (m < 0)) {
            num2 = (q + 1) * m;
        } else {
            num2 = (q - 1) * m;
        }

        // Calculate distances
        int diff1 = Math.abs(n - num1);
        int diff2 = Math.abs(n - num2);

        // Choose closest number
        if (diff1 < diff2) {
            return num1;
        } else if (diff2 < diff1) {
            return num2;
        }

        // If both are equally close, choose maximum absolute value
        return Math.max(Math.abs(num1), Math.abs(num2)) == Math.abs(num1)
                ? num1
                : num2;
    }
}