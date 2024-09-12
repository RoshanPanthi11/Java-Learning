interface Camera{
	void takeSnap();
	void recordVoice();	
	default void record4kVideo() {
		System.out.println("Recording in 4k..");
	}//we can override this method 
}
interface Wifi{
	String [] getNetworks();
	void connectToNetwork(String netwroks);
}

class MyCellPhone{
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
class MySmartPhone extends MyCellPhone implements Wifi, Camera{
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
} 
public class Default_method {
   public static void main(String[] args) {
	   MySmartPhone ms=new MySmartPhone();
	   ms.record4kVideo();
	   String[] ar=ms.getNetworks();
	   for(String item:ar) {
		   System.out.println(item);
	   }
   }
}
