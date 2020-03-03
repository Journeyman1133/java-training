package JavaTraining;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date currentDate = new Date();
		System.out.println(currentDate);

		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		System.out.println(timeFormat.format(currentDate));

		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(dateFormat.format(currentDate));

		SimpleDateFormat dayOfTheWeek = new SimpleDateFormat("E"); // EEEEEE to
																	// spell out
																	// the day
		System.out.println(dayOfTheWeek.format(currentDate));
		
		SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm:a");
		System.out.println(clockFormat.format(currentDate));
	}

}
