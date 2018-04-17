package Leetcode;

// CTC---apart from ist row,ist col, iterate all cells.
// set correspondng cell in ist row,ist col zero if matrix[i][j]=0
//later again iterate and make rows columns zero..only if corresponding ist row/column entry suggests so
//last nullify ist row ist col zero if necessary
public class SetMatrixZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void setZeroes(int[][] matrix) {
		boolean rowHasZero=false;
		boolean colHasZero=false;
		for(int j=0;j<matrix[0].length;j++){
			if(matrix[0][j]==0){
				rowHasZero=true;
				break;
			}
		}
		for(int i=0;i<matrix.length;i++){
			if(matrix[i][0]==0){
				colHasZero=true;
				break;
			}
		}
		for(int i=1;i<matrix.length;i++){
			for(int j=1;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					matrix[i][0]=0;
					matrix[0][j]=0;
				}
			}
		}
		for(int i=1;i<matrix.length;i++){
			if(matrix[i][0]==0){
				nullifyRow(matrix, i);
			}
		}
		for(int j=1;j<matrix[0].length;j++){
			if(matrix[0][j]==0){
				nullifyCol(matrix, j);
			}
		}
		if(rowHasZero){
			nullifyRow(matrix, 0);
		}
		if(colHasZero){
			nullifyCol(matrix, 0);
		}
	}
	private void nullifyRow(int[][] matrix, int row){
		for(int j=0;j<matrix[0].length;j++){
			matrix[row][j]=0;
		}
	}
	private void nullifyCol(int[][] matrix, int col){
		for(int i=0;i<matrix.length;i++){
			matrix[i][col]=0;
		}
	}

}
