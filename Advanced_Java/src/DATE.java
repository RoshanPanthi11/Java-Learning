import java.util.Date;
import java.util.Calendar;
public class DATE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Date d=new Date();
       System.out.println(d);  
       System.out.println(d.getTime());
       System.out.println(d.getYear());
       //calender class
        Calendar c= Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone()); 
        
	}

}
