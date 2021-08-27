class Solution{

    public void threeWayPartition(int[] arr, int a, int b){
        int n = arr.length;
        int j = 0;
        int k=n-1;
        for(int i=0; i<=k;)
        {
            if(arr[i]<a){
                arr[j] += arr[i] - (arr[i] = arr[j]);
                j++;
                i++;
            }
            else if(arr[i]>b)
            {
                arr[k] += arr[i] - (arr[i] = arr[k]);
                k--;
            }
            else
                i++;
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }


    }
    public static void main(String[] args) {
        int[] arr = {7,2,4,1,5};
        int a = 3;
        int b = 5;
        Solution sol = new Solution();
        sol.threeWayPartition(arr, a, b);
        
    }
}