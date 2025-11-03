// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
	String[] time = args[0].split(":");
  	int hours = Integer.parseInt(time[0]);
  	String mins = time[1];
    
	if(hours == 00){
	int hour0 = hours + 12;
	System.out.println(hour0 + ":" + mins + " AM");}
	
	else{
	if (hours > 12){
	   int hour = hours - 12;
	   System.out.println(hour + ":" + mins + " PM");
	 } 
	else{
		if(hours == 12){
		System.out.println(hours + ":" + mins + " PM");
	    }
	    else{
		System.out.println(hours + ":" + mins + " AM");

	    }
    }
	
	}
	}
}

