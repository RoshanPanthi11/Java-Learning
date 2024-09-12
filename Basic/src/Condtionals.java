import java.util.Scanner;
public class Condtionals {
	public static void main(String[] args) {
		/*int age =26;
		
		if(age>18) {
			System.out.println("Yes man, you can drive");
		}
	
	else {
		System.out.println("No man, you cant drive");
	}*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Good to here that you want to give a engineering entrance exam \nwe do have some criteria\nlet's check!");
		System.out.println("Enter the grade");
		float a = sc.nextFloat();
		if (a>=0.00 && a<=4.00)
		{
		if (a>3.2 && a<3.6) {
			System.out.println("Congratulation! you score Grade A and you are eligible");
		}
		else if(a>3.6 && a<4.0)
		{
			System.out.println("Congratulation! you score Grade A+ and you are eligible");
		}
		else if (a>2.8 && a<3.2) {
			System.out.println("Congratulation! you score Grade B+ and you are eligible");
		}
		else {
			System.out.println("Sorry! you are not eligible for Engineering Entrance");
		}
		}
		else {
			System.out.println("Invalid");
		}
			
			
				
	}
}
