class Solution {
    static int closestNumber(int n, int m) {
        // code here
        int a = n / m;

                int num1 = a * m;
                int num2 = (a + (n * m > 0 ? 1 : -1)) * m;

                if (Math.abs(n - num1) < Math.abs(n - num2)) {
                    return num1;
                }
                else if (Math.abs(n - num1) > Math.abs(n - num2)) {
                    return num2;
                }
                else {
                    return Math.abs(num1) > Math.abs(num2) ? num1 : num2;
                }
    }
}