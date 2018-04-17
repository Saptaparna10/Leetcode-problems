
public class MatrixDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixDelete m = new MatrixDelete();
		int matrix[][] = {{1,2},{3,4},{5,6}};
		int[] rowsToDelete={0};
		int[]  columnsToDelete={0};
		int[][] res=m.constructSubmatrix(matrix, rowsToDelete, columnsToDelete);
		 for(int i=0;i<res.length;i++){
		        for(int j=0;j<res[0].length;j++){
		           System.out.println(res[i][j]);
		        }
		 }
	}
	int[][] constructSubmatrix(int[][] matrix, int[] rowsToDelete, int[] columnsToDelete) {
	    
	    int newArray[][] =new int[matrix.length-rowsToDelete.length][matrix[0].length-columnsToDelete.length];
		
	    int k=0;
	    int l=0;
	    boolean found;
	    for(int i=0;i<matrix.length;i++){
	    	found=false;
	    	l=0;
	        for(int j=0;j<matrix[0].length;j++){
	            if(!find(rowsToDelete,i) && !find(columnsToDelete,j)){
	            	found=true;
	                newArray[k][l++]=matrix[i][j];
	            }
	        }
	        if(found)
	        	k++;
	        
	    }
	    return newArray;
	}

	boolean find(int[] arr, int num){
	    for(int t:arr){
	        if(t==num){
	            return true;
	        }
	    }
	    return false;
	}

}
