import java.util.*;

class Solution {

    void union(int[] a, int[] b) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            hs.add(b[i]);
        }

        for (int i : hs) {
            System.out.print(i + " ");
        }
    }

    void Intersection(int[] a, int[] b) {
        int i, j;
        i = j = 0;

        HashSet<Integer> hs = new HashSet<>();

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i] > b[j]) {
                j++;
            } else {
                hs.add(a[i]);
                i++;
                j++;
            }
        }

        for (int element : hs) {
            System.out.print(element + " ");
        }

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 3, 4, 5, 6 };

        Solution sol = new Solution();
        System.out.print("Union is :- ");

        sol.union(a, b);

        System.out.println();
        System.out.print("Intersection is :- ");
        sol.Intersection(a, b);

    }
}