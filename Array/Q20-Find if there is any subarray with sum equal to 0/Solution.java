import java.util.*;
class Solution{
    static boolean findSum(int[] arr,int n)
    {
        Map<Integer, Boolean> map = new HashMap<>();
        int sum = 0;
        for(int i=0; i<n; i++)
        {
            sum += arr[i];
            if(sum ==0 || map.containsKey(sum))
            {
                return true;
            }
            map.put(sum,true);
        }
        return false;

    }
    public static void main(String[] args) {
        int[] arr = {-3, 2, 3, 1, 6};
        int n = arr.length;
        System.out.print(Solution.findSum(arr, n));
    }
}