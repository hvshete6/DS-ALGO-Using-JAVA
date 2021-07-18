class Solution {
    static void reArrange(int[] a, int n) {
        int j = 0;
        int temp;

        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                if (i != j) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
                j++;
            }
        }

    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int size = a.length;
        reArrange(a, size);
        printArray(a);
    }

}