interface Camera1{
	void takeSnap();
	void recordVoice();	
	default void record4kVideo() {
		System.out.println("Recording in 4k..");
	}//we can override this method 
}
interface Wifi1{
	String [] getNetworks();
	void connectToNetwork(String netwroks);
}

class MyCellPhone1{
	void callNumber(int phoneNumber) {
		System.out.println("calling"+phoneNumber);
	}
	void pickCall() {
		System.out.println("Connecting...");
	}
	/*void takeSnap()
	{
		System.out.println("Taking snap");
	}*/
}
class MySmartPhone1 extends MyCellPhone1 implements Wifi1, Camera1{
	public void recordVoice() {
		System.out.println("Recording voice");
	}
	public void takeSnap()
	{
		System.out.println("Taking snap");
	}
	public String [] getNetworks() {
		System.out.println("Getting list of Networks");
		String [] networksList= {"roshan","Demon","sanjib"};
		return networksList;
	}
	public void connectToNetwork(String netwroks) {
		System.out.println("Connecting to"+ netwroks);
	}
	public void sampleMeth() {
		System.out.println("meth");
	}
} 
public class Polymorphism_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Camera1 cam1= new  MySmartPhone1();//only used camera method
    cam1.takeSnap(); //use camera function for camera interfaces obj
    //cam1.sampleMeth();//not allowed
    MySmartPhone1 s=new MySmartPhone1();
    s.sampleMeth();
    s.getNetworks()	;
    s.callNumber(98499);
	}

}
