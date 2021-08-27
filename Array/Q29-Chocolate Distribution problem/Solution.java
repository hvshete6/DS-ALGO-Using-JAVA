import java.util.Arrays;

class Solution{

    static void chocolateDistribution(int[] arr, int n, int m)
    {
        Arrays.sort(arr);
        long min = Integer.MAX_VALUE;
        for(int i=0; i<=(n-m); i++){
            if((arr[m-1+i]) - arr[i] < min)
            {
                min = arr[m-1+i] - arr[i];
            }
        }
        System.out.print(min);
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int n = arr.length;
        int m = 5;
        Solution.chocolateDistribution(arr, n, m);
       
    }
}