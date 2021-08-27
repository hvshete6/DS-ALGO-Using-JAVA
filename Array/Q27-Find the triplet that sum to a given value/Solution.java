import java.util.*;

class Solution{

    static int find3Array(int[] arr, int n, int x){
        Arrays.sort(arr);
        for(int i=0; i< n-2; i++)
        {
            int j = i+1;
            int k = n-1;    
            int sum = x - arr[i];
            while(j<k){
                if(arr[j] + arr[k] == sum)
                {
                    return 1;
                }
                if(arr[j] + arr[k] < sum)
                    j++;
                else
                    k--;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int n = arr.length;
        int x = 13;
        System.out.print(Solution.find3Array(arr, n, x));
    }
}