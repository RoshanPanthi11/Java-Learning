import java.util.Scanner;
public class Percentage {
	public static void main(String[] args) {
		float percentage;
		
		System.out.println("enter the marks of 5 subject"); 
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the marks in Math");
		float math = sc.nextFloat();
		System.out.println("enter the marks in Physics");
		float phy = sc.nextFloat();
		System.out.println("enter the marks in Chemistry");
		float che = sc.nextFloat();
		System.out.println("enter the marks in Nepali");
		float nep = sc.nextFloat();
		System.out.println("enter the marks in English");
		float eng = sc.nextFloat();
		System.out.println("enter the marks in totalmark");
		float fullMark = sc.nextFloat();
		float totalScore=math+phy+che+nep+eng;
		System.out.println(totalScore);
		 percentage=(float)((totalScore / (fullMark*5))*100);
		System.out.println("percentage is "+ percentage +"%"); 
}
}
