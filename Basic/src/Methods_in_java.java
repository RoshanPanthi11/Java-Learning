
public class Methods_in_java {
 // A function is method
	//syntax: Data_Type name()
	//{ method body}
	//Method can be called by creating an object.
	static void tell_joke() {
		System.out.println("To the guy who invented zero: Thanks for nothing!");
	}
	static void changes(int[] arr) {
		arr[0]=100;
		
	}
	static int logics (int x ,int y)
	{
		int z;
		if(x>y)
		{
			z=x+y;
		}
		else {
			z=(x+y)*5;
		}
		return z;
	}
	//overloading method
	static void foo() {
		System.out.println("good morning");
	}
	static void foo(int e) {
		System.out.println("good morning "+e+" bro");
	}
	static void foo(int e,int f)//we cant overload by changing return type
	{
		System.out.println("good morning "+e+" bro");
		System.out.println("good morning "+f+" bro");
	}
	
	public static void main(String[] args) {
		tell_joke();
		int a=5;
		int b=6;
		int c=logics(a,b);
		int a1=60;
		int b1=70;
		int c1=logics(a1,b1);
		System .out.println(c);
		System .out.println(c1);
		int [] marks= {22,33,44,55,66,77};
		changes(marks);
		System.out.println("the value of marks after runnig is:"+ marks[0]);
		
		//method overloading
		foo();
		foo(300);
		foo(300,400);//Argument are actual!
	}

}
