
public class AppointmentTime {
	private int hour;
	private int min;
	private int sec;
	
	public int getHour() { return hour; }
	
	public int getMin() { return min; }
	
	public int getSec() { return sec; }
	
	public void setHour(int hour) { this.hour = hour; }
	
	public void setMin(int min) { this.min = min; }
	
	public void setSec(int sec) { this.sec = sec; }
	
	public AppointmentTime() {
		hour = 1;
		min = 0;
		sec = 0;
	}
	
	public AppointmentTime(int hour, int m, int sc) {
		this.hour = hour;
		min = m;
		sec = sc;
	}
	
	public String toString() {
		return (hour + ":" + min + ":" + sec);
	}
}
