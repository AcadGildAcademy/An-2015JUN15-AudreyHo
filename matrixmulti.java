
public class matrixmulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] num = new int [10][10];
		for (int row=0; row <num.length;row++){
			for(int col=0; col<num[row].length;col++){
				System.out.print(row*col);
			}
			System.out.println();
		}

	}

}
