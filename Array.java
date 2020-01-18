
public class Array {

	public static void main(String[] args) {
		// step1 : create arrays
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		
		// step2 : put random data to array
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				int r1 = (int)(Math.random() * 31);
				int r2 = (int)(Math.random() * 31);
				x[i][j] = r1;
				y[i][j] = r2;
				z[i][j] = x[i][j] + y[i][j];
				System.out.print(z[i][j] + "\t");
			}System.out.println();
		}
		//pritn all arrays
		
	}
	
}
