
import java.util.Date;

public class TimeDifference {

	public static void main(String args[])
	{

		long secondsInMilli = 1000;
		long minutesInMilli = secondsInMilli * 60;
		long hoursInMilli = minutesInMilli * 60;
		long daysInMilli = hoursInMilli * 24;
		Date EndTime = new Date();//In place of new date place end date here
		Date now = new Date();

		long difference = EndTime.getTime() - now.getTime();
		long remainingDays = difference / daysInMilli;
		difference = difference % daysInMilli;

		long remainingHours = difference / hoursInMilli;
		difference = difference % hoursInMilli;

		long remainingMinutes = difference / minutesInMilli;
		difference = difference % minutesInMilli;

		long remainingSeconds = difference / secondsInMilli;

		if (remainingDays <= 0) {
			if (remainingHours > 0) {
				if (remainingHours == 1) {
					System.out.println(remainingHours+" hour");
				} else {
					System.out.println(remainingHours+" hours");
				}
			} else if (remainingHours < 0 && remainingMinutes > 0) {
				if (remainingMinutes == 1) {
					System.out.println(remainingMinutes+" minute");
				} else {
					System.out.println(remainingMinutes+" minutes");
				}
			} else if (remainingMinutes < 0 && remainingSeconds > 0) {
				System.out.println(remainingSeconds+" seconds");
			} else {
				System.out.println(remainingHours+" hour");
			}
		} else {
			if (remainingDays == 1) {
				System.out.println(remainingDays+" day");
			} else {
				System.out.println(remainingDays+" days");
			}
		}

	}
}
