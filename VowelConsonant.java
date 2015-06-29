import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
	
	Scanner letter = new Scanner(System.in);
	String x;
	System.out.println("Check to see if letter is vowel or consonant");
	x = letter.next();
	
	switch (x.charAt(0))
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u': System.out.println("It is a vowel");
		break;
		
	default: System.out.println("It is a consonant");
		break;

	}

	}

}

