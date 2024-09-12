import java.util.Scanner;
public class Loops {
	public static void main(String[] args) {
		//while loop
		int i=1;
		while(i<=3)//we can also which true or false
		{
			System.out.println(i);
			i++;
		}
		//Print natural number from 100 to 200
		int num=100;
		while(num<=200) {
			System.out.println(num);
			num++;
		}
		//Do while loop	
		int b = 10;
		do {
			System.out.println(b);//FIRST print then check.
		}while(b<5);
		int natural=1;
				do {
					System.out.println(natural);
					natural++;
					
				}while(natural<=45);
		//for Loop
		
		for (int x=100;x<=111;x++)
		{
			System.out.println(x);
		}
		int y=5;
		for(int j=0;j<=4;j++)//increment
		{
			System.out.println(2*j+1);
		}
		int z=5;
		for(int k=5;k>0;k--)//decrement
		{
			System.out.println(2*k+1);
		}
	}

}
