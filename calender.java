import java.util.Scanner;
import java.util.Calendar;
public class calender {
	private static int cal;

	public static void main(String[] args) {
	Scanner calender = new Scanner(System.in);
	System.out.println("Enter a Year");
	int year = calender.nextInt();
	System.out.println("Enter a Month");
	int month = calender.nextInt();
	int days=0;
	
	switch (month){
	case 1: 
		cal =Calendar.JANUARY;
			days = 31;
			break;
	case 2: 
		cal =Calendar.FEBRUARY;
			days =29;
			break;
	case 3: 
		cal =Calendar.MARCH;
			days= 31;
			break;
	case 4: 
		cal =Calendar.APRIL;
			days= 30;
			break;
	case 5: 
		cal =Calendar.MAY;
			days= 31;
			break;
	case 6: 
		cal =Calendar.JUNE;
			days= 30;
			break;
	case 7: 
		cal =Calendar.JULY;
			days= 31;
			break;
	case 8: 
		cal =Calendar.AUGUST;
			days= 31;
			break;
	case 9: 
		cal =Calendar.SEPTEMBER;
			days= 30;
			break;
	case 10: 
		cal =Calendar.OCTOBER;
			days= 31;
			break;
	case 11: 
		cal =Calendar.NOVEMBER;
			days=30;
			break;
	case 12: 
		cal =Calendar.DECEMBER;
			days=31;
			break;}
	
	String response ="There are "+ days+ " days in "+ month+ " of " + year+".\n";
	System.out.println(response);
	
	

	}
	

	}


