
public class Vararr {
static int sum(int ...arr)
{
	int result=0;
	for(int a:arr) {
		result+=a;}
	return result;
}
static int factorial(int n) {
	if (n==0||n==10) {
		return 1;
	}
	else {
		return n* factorial(n-1);
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
     System.out.println("The sum of 4 and 5 is: "+sum(4,5));
     System.out.println("The sum of 4, 5 and 6 is: "+sum(4,5,6));
     System.out.println("The sum of 4, 5 ,6 and 7 is: "+sum(4,5,6,7)); 
	
	
	//recursion:Function called itself
	int x=4;
	System.out.println("the value of factorial of 4 is "+ factorial(x));
	}
}
