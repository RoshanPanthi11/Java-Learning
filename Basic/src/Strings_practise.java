
public class Strings_practise {
	public static void main(String[] args) {
		//practice sets
		//To convert a string in a lowercase
		String name="RoshaN";
		String lc=name.toLowerCase();
		System.out.println(lc);
		
		//to replace space with underscore
		
		String text="ROSHAN PANTHI";
		String underscore=text.replace(' ','_');
		System.out.println(underscore);
		
		//convert <lname> to somename
		String letter="dear <|name|>,Thanks a lot";
		String letter1=letter.replace("<|name|>", "Harry");
		System.out.println(letter1);
		
		//WAP to detect double and triple space
		String mystrings ="here is   double and triple space";
		System.out.println(mystrings.indexOf("  "));
		System.out.println(mystrings.indexOf("    "));
		 
		//format the below string letter format
		String letter2="Dear Roshan,\n\tThis is java practice set.\n\tThanks!";
		System.out.println(letter2);
		
		
		
	}
	
}
