import java.util.Scanner;
public class challenge1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int age;
		System.out.print("Enter your age");
		age = a.nextInt();
		
		if (age>=18) {
			System.out.println("You are eligible to vote");
			}
		
		else if (age <18){
				System.out.println("You are not eligible to vote");
			}
		}
		

	}

