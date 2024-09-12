interface sampleInterface{
	void meth1();
	void meth2();
}
interface childSampleInterface {
	void meth3();
	void meth4();
}
class Mysampleclass implements childSampleInterface,sampleInterface{
	public void meth1() {
		System.out.println("meth 1");
	}
	public void meth2() {
		System.out.println("meth 2");
	}
	public void meth3() {
		System.out.println("meth 3");
	}
	public void meth4() {
		System.out.println("meth 4");
	}
}
public class Interfaces_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Mysampleclass obj=new Mysampleclass();
 obj.meth1();
 obj.meth2();
 obj.meth3();
 obj.meth4();
	}

}
