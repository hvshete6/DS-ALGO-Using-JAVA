class Solution {

    static void ReverseArray(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void PrintArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        PrintArray(arr, arr.length);
        System.out.println();
        System.out.print("Reversed array is :- ");
        ReverseArray(arr, 0, arr.length - 1);
        PrintArray(arr, arr.length);

    }

}
