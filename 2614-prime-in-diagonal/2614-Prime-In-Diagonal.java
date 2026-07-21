class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int a = nums[i][i];
            if (isPrime(a)) {
                ans = Math.max(ans, a);
            }

            int b = nums[i][n - 1 - i];
            if (isPrime(b)) {
                ans = Math.max(ans, b);
            }
        }

        return ans;
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}