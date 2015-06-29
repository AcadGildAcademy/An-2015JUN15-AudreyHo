import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	int x;
	System.out.println("Check to see if it is a leap year.");
	x = a.nextInt();
	
	if ((x % 100 ==0) && (x % 400 ==0))
	System.out.println("It is a leap year");
	
	else if (x % 4 == 0)
	System.out.println("It is a leap year");
	
	else
		System.out.println("It is not a leap year");
	


	}

}
