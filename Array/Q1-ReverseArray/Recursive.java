class Recursive {

    static void ReverseArray(int[] arr, int start, int end) {
        int temp = 0;
        if (start > end) {
            return;
        }

        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        ReverseArray(arr, start + 1, end - 1);

    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        printArray(arr, arr.length);
        ReverseArray(arr, 0, arr.length - 1);
        System.out.println();
        printArray(arr, arr.length);
    }

}