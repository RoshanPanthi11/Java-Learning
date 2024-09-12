  import java.util.Scanner;
public class Nested_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] marks = new int[3];
	        marks[0] = 7;
	        marks[1] = 56;
	        marks[2] = 6;
	        Scanner sc=new Scanner(System.in);
	        boolean flag=true;
	        while(flag) {
	        System.out.println("Enter the index number of array");
	        int ind=sc.nextInt();
		try {
			System.out.println("Welcome to nested try tutorial");
			try {
				System.out.println(marks[ind]);
				flag=false;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Sorry this array index doesnot exist");
				System.out.println("Exception in level 2");
			}
		}
		catch(Exception e) {
			System.out.println("Exception in level 1");
		}
	        }
	        System.out.println("thanks for using this program");
	}

}
