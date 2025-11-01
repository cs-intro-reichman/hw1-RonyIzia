// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	String[] time = args[0].split(":");
  	int hours = Integer.parseInt(time[0]);
  	int mins = Integer.parseInt(time[1]);
  
    String[] periods = {"AM", "PM"};
	String period = periods[Math.floorDiv(hours,12)];

	int formattedHours = (hours % 12 == 0) ? 12 : hours % 12;

	System.out.println(formattedHours + ":" + mins + " " + period);
	}
}


