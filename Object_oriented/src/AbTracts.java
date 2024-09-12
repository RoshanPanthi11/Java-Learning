 
 abstract class parent{
	 public parent()
	 {
		 System.out.println("I am a constructor");
	 }
	 public void sayhello() {
		 System.out.println("hello");
	 }
	 abstract public void greet(); 
	 abstract public void greet2(); 
 }
 class child extends parent{
	 public void greet(){
		 System.out.println("Good morning");
	 }
	 public void greet2(){
		 System.out.println("Good evening");
	 }
	 
 }
  abstract class child2 extends parent{
	 public void th(){
		 System.out.println("i am good");
	 }
  }
 
public class AbTracts {
     //existing in thought or an idea but not having physical or concrete existence.
	 // abstracts class mean class having abstract method
	public static void main(String[] args) {
		//parent p=new parent();//not allowed cause it is abstract class
		child c= new child();
		//child2 c= new child2();;//not allowed
		

	}

}
