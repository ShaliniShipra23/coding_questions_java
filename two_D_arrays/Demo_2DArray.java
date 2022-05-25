package two_D_arrays;
import java.util.*;
public class Demo_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		arr[i][j]=scn.nextInt();
        	}
        }
        
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		System.out.print(arr[i][j]);
        	}
        }
        
        		
	}

}
