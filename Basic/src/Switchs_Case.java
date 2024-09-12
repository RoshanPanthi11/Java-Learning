import java.util.Scanner;
public class Switchs_Case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Age=sc.nextInt();
		switch(Age) {
		case 18:
		   System.out.println("you are going to become adult!");
		break;
		case 28:
			   System.out.println("you are going to marrige!  ");
			break;
		case 38:
			   System.out.println("You have your own family!");
			break;
		default:
			 System.out.println("Enjoy your life"); 
				
		}

	}

}
