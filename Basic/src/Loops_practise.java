
public class Loops_practise {

	public static void main(String[] args) {
		/*Print start
		 ****
		 ***
		 **
		 * 
		    */
		int n=4;
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
		System.out.print("\n");
		}
		
		//WAP to sum first n even number
		
		int sum=0;
		int x=4;
		for(int i=0;i<x;i++)
		{
			sum=sum+(2*i);
		}
		System.out.print("Sum of even number is: ");
		System.out.println(sum);
		
		//multiplication 
		int y=5;
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d X %d =%d\n",y,i,y*i );
		}
		System.out.println();
		//multiplication in reverse order
		int z=5;
		for(int i=10;i>0;i--)
		{
			System.out.printf("%d X %d =%d\n",z,i,z*i );
		}
		
		//factorial of number 
		
		/*int fact=1;;
		int fact_num=5;
		for(int i=1;i<=fact_num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact); */
	
	int fact=1;
	int k=1;
	int fact_num= 5;
	while(k<=fact_num) {
		fact=fact*k;
		k++;
	}
	System.out.println(fact);
	
	
	}
}
