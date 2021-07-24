
import java.util.Arrays;


class Solution {

    void findDuplicate(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (a[i] == a[i + 1]) {
                System.out.print(a[i]);
                break;
            }

        }

    }

    public static void main(String[] args) {
        int[] a = { 1, 1 };
        Solution sol = new Solution();
        sol.findDuplicate(a);

    }
}
