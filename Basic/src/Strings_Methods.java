
public class Strings_Methods {
	public static void main(String[] args) {
		
		String name="Roshan";
		System.out.println(name);
		int value=name.length();
		System.out.println(value);
	//	String lstring =name.toLowerCase();
	//	System.out.println(lstring);
	//	String ustring =name.toUpperCase();
	//	System.out.println(ustring);
		
	//	String nonTrimmedString ="     Roshan    ";
	//	System.out.println(nonTrimmedString);
	//	String TrimmedString=nonTrimmedString.trim();
	//	System.out.println(TrimmedString);
		
		System.out.println(name.substring(3));//count from zero (start)
		System.out.println(name.substring(1 ,5));//(end)
		System.out.println(name.replace("R","fuck")); 
		System.out.println(name.startsWith("Ro"));
		System.out.println(name.endsWith("an"));
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('s'));
		System.out.println(name.indexOf('n',2));//start to search from index 2 if not found then return -1
		System.out.println(name.equals("Roshan"));//return true if equal
		//sequences character:\n \t etc...
		System.out.println("I am escape sequence\n new line");
		
		
		
		
		
	}
}
