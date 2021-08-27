class Solution{

    public static long subArray(long[] a, long n, long x){
        long start = 0, end = 0;
        long ans = n+1;
        int sum = 0;
        while(end<n)
        {
            //Expand the window.
            while(sum<=x && end<n)
            {
                sum+= a[(int)end];
                end++;
            }

            //Shrink The Window.
            while(sum>x && start<n)
            {
                ans=Math.min(ans,end-start);
                sum -= a[(int)start];
                start++;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        long[] a={1, 4, 45, 6, 0, 19};
        long n = a.length;
        long x = 51;
        System.out.print("Smallest Subarray with sum more than given value is " + Solution.subArray(a, n, x));
    }

}