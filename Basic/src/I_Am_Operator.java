
public class I_Am_Operator {

	public static void main(String[] args) {
		//Arthimetic operator can't work for boolen
		int a = 4;
		int b= 6+a;//some operator
		int c=5;
		int d=14%c;//modulo
		System.out.println(b);
		System.out.println(d);
		//comparison operator
		System.out.println(6==6);
		System.out.println(49<6);
		System.out.println(66<=66);
		//logical operator
		System.out.println(6==6 && 66>6);//in add operator both should be true
		System.out.println(5>4 || 4>5);//in or operator if one is true then it true
		//bitwise operator 
		// it works on bits
		System.out.println(2&3);
		System.out.println(3|2);
		
		
		
	}

}
