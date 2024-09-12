 
 class Employee{
	 int id;
	 String name;
	 int salary;
	 //we use getter and getter for private attributes
	 public void printdetails() {
		 System.out.println("My ID is: "+id);
		 System.out.println("My Name is: " +name);
	 }
	 public int getsalary() {
		 return salary;
	 }
	 	
}
public class Classes {

	public static void main(String[] args) {
		Employee roshan=new Employee();//instantiating a new object
		Employee ram=new Employee();
		//setting properties
		roshan.id=12;//we cant access if id and name are private in class
		roshan.name="Roshan Panthi";
		roshan.salary=34;
		
		ram.id=13;
		ram.name="Ram Sen";
		ram.salary=12;
		int salary=ram.getsalary();
		
		// printing the attribute
		//System.out.println(roshan.id);
		//System.out.println(roshan.name);
        roshan.printdetails();
        ram.printdetails(); 
        System.out.println(salary);
	}

}
