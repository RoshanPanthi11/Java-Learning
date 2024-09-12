
interface Bicycle{
	int a=45;//you can create properties in Interfaces
	void applyBrake(int decrement);
	void speedUp(int increment);
}
interface hornbicycle{
	
	void blowhorns();
	void blowhorss();
}
class avancycle implements Bicycle , hornbicycle{
	void blowHorn() {
		System.out.println("Pee pee poo poo");	
	}
	public void applyBrake(int decrement)
	{
		System.out.println("Applying Brake");
	}
	public void speedUp(int increment)
	{
		System.out.println("Applying speedup");
	}
	public void blowhorns() {
		System.out.println("hey jude pe pe pe");
	}
	public void blowhorss() {
		System.out.println("hey jude po po po");
	}
	
}
public class Interferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      avancycle cycle=new avancycle();
      cycle.applyBrake(1);
      //cycle.a=43;//not allowed to modify properties in interfaces cause it is final.
      System.out.println(cycle.a);
      cycle.blowhorns();
      cycle.blowhorss();
      
	}

}
