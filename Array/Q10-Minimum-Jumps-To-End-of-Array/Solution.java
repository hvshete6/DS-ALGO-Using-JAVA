Time Complexity is O(n)
class Solution {

    int Solve(int[] arr, int n) {
        int maxReachable, jumps, stepsPossible;
        maxReachable = arr[0];
        jumps = 1;
        stepsPossible = arr[0];

        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return jumps;
            maxReachable = Math.max(maxReachable, i + arr[i]);
            stepsPossible--;

            if (stepsPossible == 0) {
                jumps++;
                if (i >= maxReachable)
                    return -1;
                stepsPossible = maxReachable - i;
            }

        }
        return jumps;
    }

    public static void main(String[] args) {
        //int[] a = { 1, 4, 3, 2, 6, 7 };
         int[] a = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int n = a.length;
        Solution sol = new Solution();
        System.out.print("Minimum Jumps Are:- " + sol.Solve(a, n));
    }
}
