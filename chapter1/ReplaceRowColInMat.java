//1.7 write an algorithm such that if an element in a M*N matrix is 0, its entire row and col are set to Zero.

class ReplaceRowColInMat{

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,0,6},{7,8,9},{10,11,0}};
		replaceZeros(matrix);
	}
	public static void replaceZeros(int[][] matrix){

		int r = matrix.length;
		int c = matrix[0].length;

		boolean[] rows = new boolean[r];
		boolean[] cols = new boolean[c];

		for (int i = 0;i< r ;i++ ) {
			for (int j=0;j<c ;j++ ) {
				if (matrix[i][j] == 0) {
					rows[i] = true;
					cols[j] = true;
				}
			}
		}

		for (int i = 0;i<r ;i++ ) {
			for (int j=0;j<c ;j++ ) {
				if (rows[i] || cols[j]) {
					matrix[i][j] = 0;
				}
			}
		}

		printMatrix(matrix,r,c);
	}
	public static void printMatrix(int[][] matrix,int r, int c){
		for (int i = 0;i<r ; i++) {
			for (int j=0;j<c ;j++ ) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}