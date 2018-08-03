package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class dateconv {
	// Date conversion from dd,MM,yyyy to dd MMMM yyyy
	public static void main(String[] args) throws ParseException {
		Scanner get = new Scanner(System.in);
		System.out.println("Enter date in dd,MM,yyyy format");
		String datestr = get.next();// input date

		SimpleDateFormat format1 = new SimpleDateFormat("dd,MM,yyyy");
		Date date = format1.parse(datestr);// passing format to date object

		SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");// setting formatter to dd MMMM yyyy
		String strDate = formatter.format(date);
		strDate = formatter.format(date);

		System.out.println(strDate); // printing the date after formatting it

	}

}