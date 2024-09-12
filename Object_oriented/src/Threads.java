class MyThread extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<4000) {
		System.out.println("My thread is running..");
		System.out.println("i am happy!");
		i++;
	}
	}
}
class MyThead2 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<4000) {
		System.out.println(" thread2 is good ");
		System.out.println("i am sad!");
		i++;
	}
	}
}
public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       MyThread t1=new MyThread(); 
       MyThead2 t2=new MyThead2();
       t1.start();
       t2.start(); 
	}

}
