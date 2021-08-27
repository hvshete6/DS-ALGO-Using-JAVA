import java.io.*;
import java.util.*;

class Solution
{
  public static void main (String[] args) 
  {

    int arr1[] = { 10, 5, 2, 23, 19 };
    int arr2[] = { 19, 5, 3 };
    int m=arr1.length;
    int n=arr2.length;

    Set<Integer> s = new HashSet<Integer>();
    for (int i = 0; i < m; i++)
    {
      s.add(arr1[i]);
    }
    int p = s.size();
    for (int i = 0; i < n; i++)
    {
      s.add(arr2[i]);
    }

    if (s.size() == p)
    {
      System.out.println("arr2[] is subset of arr1[] " + "\n");
    }
    else
    {
      System.out.println("arr2[] is not subset of arr1[] " + "\n" );
    }
  }
}

// This code is contributed by avanitrachhadiya2155