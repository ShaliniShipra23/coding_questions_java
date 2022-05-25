package functions;
import java.util.*;
public class decimalTobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int b = scn.nextInt();
	      int dn = getValueInBase(n, b);
	      System.out.println(dn);
	   }
	  
	   public static int getValueInBase(int n, int b){
	       
	       int ans=0,pow=1;
	       while(n>0){
	           int rem=n%b;
	           n/=b;
	           ans+=rem*pow;
	           pow*=10;
	       }
	       return ans;
	   }
	  
	}


