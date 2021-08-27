import java.util.*;
import java.lang.*;
import java.io.*;
class Solution{
    static class Node{
        int data;
        Node prev;
        Node(int data){
            this.data = data;
            this.prev = null;
        }

    }
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();
        while(t-- > 0){  //t= how many factorials you want to find ? 
            int n;       // n= factiorial of which number do you want ?
            n = s.nextInt();
            Node tail = new Node(1);
            for(int i=2; i<=n; i++)
            {
                multiply(tail, i);
            }
            print(tail);
            System.out.println();
        }
    }

    private static void print(Node tail){
        if(tail == null)
            return;
        print(tail.prev);
        System.out.print(tail.data);
    }

    private static void multiply(Node tail, int n){
        Node temp = tail, prevNode = null;
        int carry = 0;
        while(temp!=null)
        {
            int data = temp.data *n + carry;
            temp.data = data % 10;
            carry = data/10;
            prevNode = temp;
            temp = temp.prev;
        }
        while(carry != 0)   //If we have carry as 124, then this code will do 1-->2-->4
        {
            prevNode.prev = new Node((int)(carry%10));
            carry /= 10;
            prevNode = prevNode.prev;
        }

    }
}