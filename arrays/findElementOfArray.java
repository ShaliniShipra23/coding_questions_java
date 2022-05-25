package arrays;
import java.util.*;
public class findElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int d=scn.nextInt();
        int elementOfArr=EOA(arr,d);
        System.out.print(elementOfArr);
	}
	
	public static int EOA(int arr[],int d) {
		 for(int i=0;i<arr.length;i++){
			 if(arr[i]==d)
				 return i;
		 }
		 return -1;
	}

}
