class Solution {

    static class eleCount {
        int element;
        int count;
    }

    static void moreThanNbyK(int[] arr, int n, int k) {
        if (k < 2)
            return;
        eleCount[] temp = new eleCount[k - 1];
        for (int i = 0; i < k - 1; i++) {
            temp[i] = new eleCount();
            temp[i].count = 0;
        }

        for (int i = 0; i < n; i++) {
            int j; 
            for ( j = 0; j < k - 1; j++) {
                if (temp[j].element == arr[i]){

                    temp[j].count += 1;
                    break;
                }
            }
            if (j == k - 1) {
                int l;

                for (l = 0; l < k - 1; l++) {
                    if (temp[l].count == 0) {
                        temp[l].element = arr[i];
                        temp[l].count = 1;
                        break;
                    }
                }

                if (l == k - 1)
                    for (l = 0; l < k - 1; l++)
                        temp[l].count -= 1;

            }

        }

        for(int i=0; i<k-1 ; i++)
        {
            int actual = 0;
            for(int j=0; j<n; j++)
                if(arr[j] == temp[i].element)
                    actual++;
            if(actual>=n/k)
                System.out.print(temp[i].element + ",");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 5, 5, 5, 5};
        int n = arr.length;
        int k = 4;
        Solution.moreThanNbyK(arr, n, k);
    }
}