class MythreadRunnable implements Runnable{
	public void run() {
		int i=0;
		while(i<4000) {
		System.out.println("I am a thread not threat");
		i++;
	}
	}
}
class MythreadRunnable2 implements Runnable{
	public void run() {
		int i=0;
		while(i<4000) {
		System.out.println("I am a thread2 not threat1");
		i++;
		}
	}
}
public class Runnable_thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MythreadRunnable bullet1=new MythreadRunnable();
		Thread gun1=new Thread(bullet1);
		MythreadRunnable2 bullet2=new MythreadRunnable2();
		Thread gun2=new Thread(bullet2);
		gun1.start();
		gun2.start();
		
		
		
		
	}

}
