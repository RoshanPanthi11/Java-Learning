class MyMainEmployee{
	 private int id;
	 private String name;
	 
	/* public MyMainEmployee() {
		 id=45;  //Automatically involked
		 name="Roshan Panthi";
	 }*/
	 public MyMainEmployee(String myname ,int myid) {
		 id=myid;  
		 name=myname;
	 }
	 //contructor overload is like a method overload
	 
	 public String getName() {
		 return name;
	 }
	 public void setName(String n) {
		 this.name=n;//this is references 
	 }
	 public void setId(int i) {
		 this.id=i;
	 }
	 public int getId() {
		 return id;
	 }
}
public class Constructors  {
 public static void main(String[] args) {
	 
		MyMainEmployee roshan = new MyMainEmployee("Roshan Panthi",45);
		//roshan.setName("Roshan Panthi");
		//roshan.setId(12);
		System.out.println(roshan.getId());
		System.out.println(roshan.getName());
	}

}
