
public class Appointment {
	private AppointmentTime startTime;
	private AppointmentTime endTime;
	private AppointmentDate date;
	
	// accessor and mutator methods
	// fill here
	
	// no-arg constructor
	public Appointment() {
		startTime = new AppointmentTime();
		endTime = new AppointmentTime();
		date = new AppointmentDate();
	}
	
	// main constructor
	public Appointment(int day, String month, int year, int hr1, int m1, int sc1, int hr2, int m2, int sc2) {
		startTime = new AppointmentTime(hr1, m1, sc1);
		endTime = new AppointmentTime(hr2, m2, sc2);
		date = new AppointmentDate(day, month, year);
	}
	
	public String toString() {
		return (date + " " + startTime + "---" + endTime);
	}
}
