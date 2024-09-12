import java.util.Scanner;
public class cwh_80_try {
	    public static void main(String[] args) {
	    	//try and catch example
	    	/*Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter two number for division");
	        int a =sc.nextInt();
	        int b =sc.nextInt();
	        // Without Try:
//	        int c = a / b;
//	        System.out.println("The result is " + c);
	        // With Try:
	        try {
	            int c = a / b;
	            System.out.println("The result is " + c);
	        }
	        catch(Exception e) {
	            System.out.println("We failed to divide. Reason: ");
	            System.out.println(e);
	        }
	        System.out.println("End of the program");
	    }*/
	    int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occured!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occured!");
            System.out.println(e);
        }
    }
	}

