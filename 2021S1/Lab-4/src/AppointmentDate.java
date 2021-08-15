
public class AppointmentDate {
	private int day;
	private String month;
	private int year;
	
	public int getDay() { return day; }
	
	public String getMonth() { return month; }
	
	public int getYear() { return year; }
	
	public void setDay(int day) { this.day = day; }
	
	public void setMonth(String month) { this.month = month; }
	
	public void setYear(int year) { this.year = year; }
	
	public AppointmentDate() {
        year = 2021;
        month = "January";
        day = 1;
    }
	
	public AppointmentDate(int day, String month, int year) {
        setDate(year, month, day);
    }
	
	public void setDate(int year, String month, int day) {
		if (isValidDate(year, month, day)){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        else {
            System.out.println("The date is invalid");
            System.exit(1);
        }
	}
	
	private boolean isValidDate(int year, String month, int day) {
		if (year<1000 || year > 2030){
            return false;
        }

        if (!(month.equals("January") || month.equals("February") ||
        	month.equals("March") || month.equals("April") ||
        	month.equals("May") || month.equals("June") ||
        	month.equals("July") || month.equals("August") ||
        	month.equals("September") || month.equals("October") ||
        	month.equals("November") || month.equals("December"))){
            return false;
        }
        
        if (day < 1 || day > 31) {
        	return false;
        }

        return true;
    }
	
	public String toString() {
		return (day + " " + month + " " + year);
	}
}
