class Solution {

    void Shift(int[] a) {
        int size = a.length;
        int temp = a[size - 1];

        for (int i = size - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;

        for (int i : a) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Solution sol = new Solution();
        sol.Shift(a);

    }
}
