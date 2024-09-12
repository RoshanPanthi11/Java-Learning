
public class Arrays {
	public static void main(String[] args) {
		//Array is a collection of similar type of data
		//int [] marks=new int[5]; //declaration and memory allocation
		//or
		
		int[] marks;//declaration
		marks=new int[5]; //memory allocation
		marks[0]=100;
		marks[1]=80;
		marks[2]=85;
		marks[3]=70;
		marks[4]=90;
		System.out.println(marks[3]);
		//declaration,memory allocation and initialization
		int[] Marks= {45,54,65,76,87};
		System.out.println(Marks[3]);
		System.out.println(Marks.length); 
		String [] students= {"Roshan","Demon","Yubraj","Sanju"};
		//System.out.println(students[2]);
		//arrar_name.lenghth gives you the length of arry
		
		//array for loop
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i]);
		}
		//printing aaray in reserve order
		int[] markss;//declaration
		markss=new int[5]; //memory allocation
		markss[0]=100;
		markss[1]=80;
		markss[2]=85;
		markss[3]=70;
		markss[4]=90;
		for(int i=markss.length-1;i>=0;i--)
		{
			System.out.println(markss[i]);
		}
		System.out.println("multidimensional\n");
		 
		//multidimensional array:Are the array of array
		int[][] flats;//2-D array
		flats=new int [2][3];
		flats[0][0]=101;
		flats[0][1]=102;
		flats[0][2]=103;
		flats[1][0]=104;
		flats[1][1]=105;
		flats[1][2]=106; 
		//display the 2-D array
		for(int k=0;k<flats.length;k++)
		{ for (int l=0;l<flats[k].length;l++){
			System.out.print(flats[k][l]);
			System.out.print(" ");	
		}
		System.out.println("");
		}
		
		
		
		 
		
	}
}
