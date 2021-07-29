import java.util.*;
class Solution {
    class Pair {
        private int value;
        private int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return this.value;
        }

        public int getIndex() {
            return this.index;
        }

    }

    int getMinDiff(int[] a , int n , int k)
    {
        ArrayList<Pair> possibleHeights = new ArrayList<>();
        int[] visited = new int[n];
        for(int i =0; i<a.length ; i++)
        {
            if(a[i] - k >=0)
            {
                possibleHeights.add(new Pair(a[i]-k, i));
            }
            possibleHeights.add(new Pair(a[i] + k, i));
            visited[i] = 0; 
        }
        Collections.sort(possibleHeights, new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                return p1.getValue() - p2.getValue();
            }
        });
        int ele=0;
        int left=0;
        int right=0;
        int size=possibleHeights.size();

        while(ele<n && right < size)
        {
            if(visited[possibleHeights.get(right).getIndex()] == 0) 
            {
                ele++;
            }
            visited[possibleHeights.get(right).getIndex()]++; //increases the no. of times visited at that index
            right++;
        }

        int ans = possibleHeights.get(right-1).getValue() - possibleHeights.get(left).getValue();

        //Sliding of window starts.
        //shift the left pointer forward to slide the window.

        while(right<size)
        {
            if(visited[possibleHeights.get(left).getIndex()] == 1)
            {
                ele--;
            }
            visited[possibleHeights.get(left).getIndex()]--;
            left    ++;

            //the below condition will execute if ele<n.

            while(ele<n && right < size)
        {
            if(visited[possibleHeights.get(right).getIndex()] == 0)
            {
                ele++;
            }
            visited[possibleHeights.get(right).getIndex()]++;
            right++;
        }
        if(ele==n)
            ans = Math.min(ans, possibleHeights.get(right-1).getValue() - possibleHeights.get(left).getValue());
        else
            break;

        }
        return ans;

    }
    public static void main(String[] args) {
        int[] a = {4,2,3,6};
        int k=3;
        int n=4;
        Solution sol = new Solution();
        System.out.print(sol.getMinDiff(a, n, k));
    }

}