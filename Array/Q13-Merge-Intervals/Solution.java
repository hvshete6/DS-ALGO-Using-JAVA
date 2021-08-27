import java.util.*;

class Solution {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(final int a[], final int b[]) {
                if (a[0] != b[0]) {
                    return a[0] - b[0];
                }
                return a[1] - b[1];

            }

        });

        int start = intervals[0][0];
        int last = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= last && intervals[i][0] >= start) {
                last = Math.max(intervals[i][1], last);
            } else {
                res.add(Arrays.asList(start, last));
                start = intervals[i][0];
                last = intervals[i][1];
            }
        }

        res.add(Arrays.asList(start, last));
        int[][] ans = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            ans[i][0] = res.get(i).get(0);
            ans[i][1] = res.get(i).get(1);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        Solution sol = new Solution();

        int[][] merge = sol.merge(intervals);

        for (int i = 0; i < merge.length; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < merge[i].length; j++) {

                System.out.print(merge[i][j] + " ");
            }
        }

    }
}