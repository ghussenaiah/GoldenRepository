package test;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class GMTConverter {

	
	public static void main(String args[]){
	
	Date fromDate = Calendar.getInstance().getTime();
	TimeZone tt=TimeZone.getTimeZone("GMT");
	System.out.println(tt.getRawOffset());
	
	
	
    Date ret = new Date( fromDate.getTime() - tt.getRawOffset() );
    
   System.out.println(ret);
   TimeZone tz = TimeZone.getDefault();
   Date ret1 = new Date( fromDate.getTime() - tz.getRawOffset());
   
   System.out.println(ret1);
}
}
