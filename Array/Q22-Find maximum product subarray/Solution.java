class Solution {

    static long maxProduct(int[] arr, int n) {
        if (n == 0)
            return 0;
        long res = 1;
        long max = 1;
        long min = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                max *= arr[i];
                min = Math.min(arr[i] * min, 1);
            } else if (arr[i] == 0) {
                min = max = 1;
            }
            else{
                min += max - (max = min); //swap
                min*=arr[i];  //multiply
                max=Math.max(1, arr[i]*max);

            }
            res = Math.max(max,res);

        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, -1, 0};
        int n = arr.length;
        System.out.print(Solution.maxProduct(arr, n));
    }
}