class Base1{
	public int x;
	Base1()
	{
		System.out.println("I am a constructor");
	}
	Base1(int x)
	{
		System.out.println("I am a overloaded constructor with value of x: " + x);
	}
	public int getX() {
		System.out.println("Roshan Panthi in base");
		return x;
		
	}
	public void setX (int x) {
		this.x= x;
	}
	}

class Derived1 extends Base1{
	public int y;
	Derived1()
	{
		//super(2);//super can be used to refer immediate parent class instance variable.
		           //super can be used to invoke immediate parent class method.
		System.out.println("I am a constructor in derived");
	}
	Derived1(int x,int y)
	{
		super(x);//put this value in super class
		System.out.println("I am a overloaded constructor with value of x and y: " + y);
	}
	public int getY() {
		System.out.println("Roshan Panthi in derived");
		return y;
	}
	public void setY(int y) {
		this.y= y;
	}
	
}
public class Cons_inheritance {
	public static void main(String[] args) {
		//Base1 b1=new Base1();//this call base1 constructor
		//Derived1 d1=new Derived1();//this call both base1 and derived1 Constructor
		Derived1 d2=new Derived1(4,5);//this call argument constructor
	}

}
