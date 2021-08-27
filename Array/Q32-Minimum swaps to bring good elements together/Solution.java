class Solution{

    public static int minSwap(int[] arr, int n, int k){
        int good = 0;
        int bad = 0;

        //counting good values
        for(int i=0;i<n; i++)
        {
            if(arr[i]<=k)
                good++;
        }

        //counting bad values in the current window
        for(int i=0; i<good; i++){
            if(arr[i]>k)
                bad++;
        }

        int i=0, j=good, ans = bad;
        while(j<n){
            //If the start of the window was bad value then reduce the bad count by one.
            if(arr[i]>k)
                bad--;
            
            //If the end of window is the bad value, increase bad count by one.
            if(arr[j]>k)
                bad++;
            
            //update ans
            ans= Math.min(ans,bad);
            i++; j++; //move window by 1

        }
        return ans;

    }


    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 5, 8, 7, 4};
        int n = arr.length;
        int k = 6;

        System.out.print(Solution.minSwap(arr, n, k));
    }
}