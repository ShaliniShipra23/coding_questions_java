package functions;
import java.util.*;
public class anybaseMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int b = scn.nextInt();
	    int n1 = scn.nextInt();
	    int n2 = scn.nextInt();

	    int d = getProduct(b, n1, n2);
	    System.out.println(d);
	 }

	 public static int getProduct(int b, int n1, int n2){
	     // write your code here
	     int ans=0,pow=1;
	     while(n2!=0){
	         int d=n2%10;
	         n2/=10;
	         int res= gpwsd(n1,d,b);
	         ans=aba(ans,res*pow,b);
	         pow*=10;
	     }
	     return ans;
	 }

	 public static int gpwsd(int n1,int d,int b){
	     int ans=0,pow=1;
	     int carry=0;
	     while(n1!=0 || carry!=0){

	         int ld=n1%10;
	         n1/=10;
	         int product=ld*d+carry;
	         int rem=product%b;
	         int quo=product/b;
	         carry=quo;
	         ans+=(rem*pow);
	         pow*=10;
	     }
	     return ans;
	 }

	 public static int aba(int n1,int n2,int b){
	     int ans=0,pow=1;
	     int carry=0;
	     while(n1>0||n2>0||carry>0){
	         int ld1=n1%10;
	         int ld2=n2%10;
	         n1/=10;
	         n2/=10;
	         int sum=ld1+ld2+carry;
	         int rem=sum%b;
	         int quo=sum/b;
	         carry=quo;
	         ans+=(rem*pow);
	         pow*=10;
	     }
	     return ans;
	 }

}
