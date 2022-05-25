package functions;
import java.util.*;
public class anybaseSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	      int b = scn.nextInt();
	      int n1 = scn.nextInt();
	      int n2 = scn.nextInt();
	  
	      int d = getDifference(b, n1, n2);
	      System.out.println(d);
	   }
	  
	   public static int getDifference(int b, int n1, int n2){
	   
	       int ans=0,pow=1;
	       int borrow=0;
	       while(n1>0||n2>0||borrow>0){
	           int ld1=n1%10;
	           int ld2=n2%10;
	           n1/=10;
	           n2/=10;
	           int diff=ld1-ld2-borrow;
	           if(diff<0){
	               borrow=1;
	               diff=diff+b;
	           }
	           else{
	               borrow=0;
	           }
	        ans+=diff*pow;
	        pow*=10;
	       }
	       return ans;
	   }
	  
	}

