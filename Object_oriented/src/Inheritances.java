

class Base{
	public int x;
	public int getX() {
		System.out.println("Roshan Panthi in base");
		return x;
		
	}
	public void setX (int x) {
		this.x= x;
	}
	}

class Derived extends Base{
	public int y;
	public int getY() {
		System.out.println("Roshan Panthi in derived");
		return y;
	}
	public void setY(int y) {
		this.y= y;
	}
	
}
public class Inheritances {
	public static void main(String[] args) {
		
      Base b= new Base();
      b.setX(4);
      System.out.println(b.getX());
      //creating an object of derived class
      //we can call function of base from object of derived but not vice versa
      Derived d= new Derived();
      d.setX(3);
      d.setY(99);
      System.out.println(d.getY());
	}

}
