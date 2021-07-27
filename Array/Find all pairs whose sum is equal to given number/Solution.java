import java.util.*;

class Solution {
    int pairsCount(int[] arr, int n, int k) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.compute(i, (ke, v) -> {
                if (v == null)
                    return 1;
                return v + 1;

            });
        }
        for (int ele : arr) {
            if (2 * ele == k) {
                res += Math.max(map.getOrDefault(ele, 0) - 1, 0);
            } else {
                res += map.getOrDefault(k - ele, 0);
            }
        }
        return res / 2;
    }

            });
        }
        for (int ele : arr) {
            if (2 * ele == k) {
                res += Math.max(map.getOrDefault(ele, 0) - 1, 0);
            } else {
                res += map.getOrDefault(k - ele, 0);
            }
        }
        return res / 2;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 2, 3 };
        int n = arr.length;
        int k = 7;
        Solution sol = new Solution();
        System.out.print(sol.pairsCount(arr, n, k));
    }
}
