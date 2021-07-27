//Time Complexity is O(n)

class Solution {

    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int profit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            }
            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] a = { 4, 8, 1, 2, 5 };
        Solution sol = new Solution();
        System.out.print("Maximum Profit is " + sol.maxProfit(a));

    }
}
