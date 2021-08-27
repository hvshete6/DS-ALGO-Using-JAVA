class Solution{
    static int minOpertions(int[] arr, int n){
        int ans=0; // to count no. of operations performed.
        int i=0, j=n-1;
        while(i<j){
            if(arr[i] == arr[j])
            {
                i++;
                j--;
            }
            else if(arr[i] < arr[j])
            {
                i++;
                arr[i] += arr[i-1];
                ans++;
            }
            else{
                j--;
                arr[j] += arr[j+1];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {11, 14, 15, 99};
        int n = arr.length;

        // int ans = Solution.minOpertions(arr, n);
        System.out.print(Solution.minOpertions(arr, n));
    }
}