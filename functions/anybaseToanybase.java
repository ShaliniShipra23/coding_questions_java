package functions;
import java.util.*;
public class anybaseToanybase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	      int n = scn.nextInt();
	      int sourceBase = scn.nextInt();
	     int  destBase= scn.nextInt();
	     int atd=atd(n,sourceBase);
	     int dta=dta(atd,destBase);
	     System.out.print(dta);
	   }
	   public static int atd(int n,int b1){
	     int ans=0,pow=1;
	     while(n>0){
	       int rem=n%10;
	       n/=10;
	       ans+=rem*pow;
	       pow*=b1;
	     }
	     return ans;
	   } 

	   public static int dta(int n,int b2){
	     int ans=0,pow=1;
	     while(n>0){
	       int rem=n%b2;
	       n/=b2;
	       ans+=rem*pow;
	       pow*=10;
	     }
	     return ans;
	   }

}
