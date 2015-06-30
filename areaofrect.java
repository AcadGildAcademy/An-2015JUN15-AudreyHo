import java.util.Scanner;

public class areaofrect {
	String name;
	int base,height;
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the width");
	double base = scanner.nextDouble();
	
	System.out.println("Enter height");
	double height = scanner.nextDouble();
	
	double area = (base* height);
	System.out.println("Area of rectangle is:" +area);
	
}
}
