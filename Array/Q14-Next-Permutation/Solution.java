class Solution {
    public void nextPermutation(int[] A) {
        if (A == null || A.length <= 1)
            return;
        int i = A.length - 2;
        while (i >= 0 && A[i] >= A[i + 1])
            i--;
        if (i >= 0) {
            int j = A.length - 1;
            // If There are no breakpoints, it is never performed.
            while (A[j] <= A[i])
                j--; // If We Get The Breakpoints, Then we again linearly iterate back,
                     // and we try to find someone who is greater than A[i]
            swap(A, i, j); // We Swap It
        }
        reverse(A, i + 1, A.length - 1); //reverse the right half.
    }

    public void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public void reverse(int[] A, int i, int j) {
        while (i < j)
            swap(A, i++, j--);

    }

    public static void main(String[] args) {
        int[] A = { 3, 2, 1 };
        Solution sol = new Solution();
        sol.nextPermutation(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

}