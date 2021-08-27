import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] a = { 3, 9, 1, 10, 4, 20, 2, 55, 56, 57, 58, 59, 60 };
        int long_length = 0;
        int no = 0;

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            if (!hs.contains(a[i] - 1)) {
                no = a[i];
                while (hs.contains(no)) {
                    no++;
                }

                if (long_length < (no - a[i])) {
                    long_length = no - a[i];
                }
            }

        }
        System.out.print("Longest Sequence Length is :- " + long_length);

    }
}