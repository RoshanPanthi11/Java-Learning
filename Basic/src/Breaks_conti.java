
public class Breaks_conti {

	public static void main(String[] args) {
		//break and continue using loop
     for(int i=0;i<5;i++)
     { 
    	 System.out.println(i);
     if(i==2)
     { System.out.println("ending loop");
     break;
     }
     }
     int a=0;
     while(a<5)
     {
    	 System.out.println(a);
         if(a==2)
         { System.out.println("ending loop");
         break;//ending the loop
     }
         a++;
	}
      for(int k=0;k<50;k++) {
    	  if(k==2)
    	  {
    		  System.out.println("Ending the loop");
    		  continue;//stop the loop for one iteration
    	  }
    	  System.out.println(k);
    	  
      }
}
} 
