package wk4hwk;

public class outofbound extends RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= new int[5];
		int i, count=0;
		for (i=0; i < num.length; i++) {
 try
 {
	System.out.println(num[7]); 
 }
 
 catch(ArrayIndexOutOfBoundsException e)
 {
	System.out.println("Out of Bounds!"); 
 }
	}
	}
}

