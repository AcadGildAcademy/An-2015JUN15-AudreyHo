import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int x;
		System.out.println("Enter number to check to see if number is even or odd");
		x= a.nextInt();
		
		if (x % 2 ==0){
		System.out.println("You have entered an even number");
		}
		
		else
		{ System.out.println("You have entered an odd number");
		}
		
		}

	}
