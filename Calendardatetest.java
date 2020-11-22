import java.util.*;

	public class Calendardatetest {
	    public static void main(String[] args) {
	        ArrayList<CalendarDate> dates = new ArrayList<CalendarDate>();
	       
	         dates.add(new CalendarDate(4, 28,1758));   // Monroe
	        dates.add(new CalendarDate(10,30,1735));// Adams
	        dates.add(new CalendarDate(3, 16,1751));   // Madison
	       	dates.add(new CalendarDate(2, 22,1732));  // Washington
	        dates.add(new CalendarDate(4, 13,1743));   // Jefferson
	        	System.out.println("Student Name: Subhash Tanikella");
	        	System.out.println("Project #3: Ch. 10. ArrayList");
	        	System.out.println("This output is run at " + (new Date()));
	        	System.out.println("birthdays = " + dates);
	        Collections.sort(dates);
	        System.out.println("birthdays = " + dates);
	    }
	}

