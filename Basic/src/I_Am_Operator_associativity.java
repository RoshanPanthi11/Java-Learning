
public class I_Am_Operator_associativity {

	public static void main(String[] args) {
		int x=6*5-34/2;
		int y=60/5-3*2;
		System.out.println(x);
		System.out.println(y);
		 //precedence & Accociativity
		// precedence of * and / is equal
	   //Accoiatiativity of * and / is left to right
	  // + and - also have same precedences
     // d=e=60;//first e=60 then d=60
     int b=4;
     int a=3;
     int c=4;
     int k=b*b-(4*a*c)/(2*a);
     System.out.println(k);
     //increment and decrement operator
     int i=45;
     System.out.println(i++);//first i will print then i is incremented
     System.out.println(i);
     System.out.println(++i);//first i is incremented then print in same line
     int j=23;
     System.out.println(j--);
     System.out.println(j);
     System.out.println(--j);
     char A='a';
     System.out.println(++A);
     //quick Quize
     int s=7;
     int t= ++s * 8;
     System.out.println(t);
     
	}

}
