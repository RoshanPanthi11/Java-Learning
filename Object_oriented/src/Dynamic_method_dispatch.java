class phone{
	public void showtime() {
		System.out.println("time is 7 am");
	}
	public void name() {
		System.out.println("turning on nokia 1200");
		
	}
}
class smartphone extends phone{
	public void music() {
		System.out.println("playing  music");
	}
	public void name() {
		System.out.println("turning on samsung m31");
		
	}
}
public class Dynamic_method_dispatch {
	public static void main(String[] args) {
		//one obj=new one();//allowed
		//two objj=new two();//allowed
		phone obj=new smartphone();//reference is supper class and obj is sub class
		//it helps to call method in class two 
		obj.showtime();
		obj.name();
		//obj.music();//not allowed
	}
}
