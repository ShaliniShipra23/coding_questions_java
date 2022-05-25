package arrays;
import java.io.*;
import java.util.*;
public class ReverseArray {

	
	public class Main{
	  public static void display(int[] a){
	    StringBuilder sb = new StringBuilder();

	    for(int val: a){
	      sb.append(val + " ");
	    }
	    System.out.println(sb);
	  }

	  public static void reverse(int[] a,int left,int right){
	    // write your code here
	    while(left<right){
	      int temp=a[left];
	      a[left]=a[right];
	      a[right]=temp;
	      left++;
	      right--;
	    }
	  }

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    for(int i = 0; i < n; i++){
	       a[i] = Integer.parseInt(br.readLine());
	    }

	    reverse(a,0,n-1);
	    display(a);
	 }

	}
}
