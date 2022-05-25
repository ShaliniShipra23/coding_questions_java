package arrays;
import java.util.*;
public class barChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        
        int max=arr[0];
        for(int i=1;i<n;i++) {
        	if(arr[i]>max)
        		max=arr[i];
        }
        
        barchart(arr,max);
	}
	
	public static void barchart(int arr[],int max) {
		for(int row=max;row>=1;row--) {
			for(int j=0;j<arr.length;j++) {
				if(row>arr[j])
					System.out.print("\t");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
