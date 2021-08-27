class Solution {

    int maxProfit(int[] a) {
        int n = a.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 0;
        }

        int ma = a[n - 1];
        int mi = a[0];

        // first traverse the array from right side to left.
        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > ma)
                ma = a[i];
            dp[i] = Math.max(dp[i + 1], ma - a[i]);
        }
        // Now traverse the array from left side to right and store max profit.
        for (int i = 1; i < n; i++) {
            if (a[i] < mi)
                mi = a[i];
            dp[i] = Math.max(dp[i - 1], dp[i] + (a[i] - mi));
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 30, 15, 10, 8, 25, 80 };
        Solution sol = new Solution();
        System.out.print(sol.maxProfit(arr));
    }

}