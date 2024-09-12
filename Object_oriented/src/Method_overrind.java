
class A{
	public int a;
	public int roshan() {
		return 4;
	}
	public void meth2() {
		System.out.println("I am the method 2 of Class A");
	}
}
class B extends A{
	@Override
	public void meth2() {
		System.out.println("I am the method 2 of Class B");
	}
	public void meth3() {
		System.out.println("I am the method 3 of Class B");
	}
	}

public class Method_overrind {

	public static void main(String[] args) {
		A a=new A();
		a.meth2();
		B b=new B();
		b.meth2();

	}

}
