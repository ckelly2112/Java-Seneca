import java.util.*;
public class Task_2_1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	long startTime = System.currentTimeMillis();
	long currentTime = System.currentTimeMillis();
	
	long totalSeconds = currentTime /1000;
	long currentSeconds = totalSeconds % 60;
	long totalMinutes = totalSeconds / 60;
	long currentMinutes = totalMinutes % 60;
	long totalHours = totalMinutes / 60;
	long currentHours = totalHours % 24 - 5;
	
	System.out.println("Current Time is " + currentHours + ":"
			+ currentMinutes + ":" + currentSeconds);
	System.out.println(System.currentTimeMillis() - startTime);
	
	
	}

}
