//Given an image represented by an N*N matix, where each pixedl in the image is 4 bytes,
//write a method to rotate the image by 90 degrees. Can you do this in inplace?


class RotateMatrix{

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
	}
	public static void rotate(int[][] matrix){
		int rows = matrix.length-1;
		int cols = matrix[0].length-1;
		int[][] rm = new int[rows+1][cols+1];

		for (int col = 0; col <= cols ; col++ ) {
			for (int row = rows; row >=0 ; row-- ) {
				rm[rows-row][col] = matrix[row][col];
				System.out.print(rm[Math.abs(row-rows)][col] + " ");
			}
			System.out.println();
		}

	}
	
}