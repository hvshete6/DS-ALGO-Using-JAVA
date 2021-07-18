import java.util.*;

class Solution {
    void sort(int[] arr, int n) {
        int low, mid, high;
        low = mid = 0;
        high = n - 1;
        int temp;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 2, 0, 1, 2, 2, 2, 2, 1, 1, 1, 1, 0, 0, 0, 0 };
        int n = arr.length;
        Solution s = new Solution();
        s.sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}