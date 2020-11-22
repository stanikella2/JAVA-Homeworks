

	public class CalendarDate implements Comparable<CalendarDate> {
	    private int month;
	    private int day;
	    private int year;

	    public CalendarDate(int month, int day, int year) {
	        this.month = month;
	        this.day = day;
	        this.year = year;
	    }

	    // Compares this calendar date to another date.
	    // Dates are compared by month and then by day.
	    public int compareTo(CalendarDate other) {
	        if (this.year != other.year) {
	            return this.year - other.year;
	            
	        } else {
	            return this.day - other.day;
	            
	        }
	        
	    }

	    public int getMonth() {
	        return this.month;
	    }

	    public int getDay() {
	        return this.day;
	    }
	    public int getyear() {
	    	return this.year;
	    }

	    public String toString() {
	        return this.month + "/" + this.day + "/" + this.year;
	    }
	}

