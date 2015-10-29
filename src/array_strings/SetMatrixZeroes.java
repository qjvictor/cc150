package array_strings;
/**
 *  Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.

click to show follow up.
Follow up:

Did you use extra space?
A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?

 * @author VictorQian
 *
 */
public class SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
		if(matrix==null || matrix[0]==null || matrix.length==0 || matrix[0].length==0)
			return;
		boolean rowFlag = false;
		boolean colFlag = false;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				colFlag = true;
				break;
			}
		}
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				rowFlag = true;
				break;
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0)
					matrix[i][j] = 0;
			}
		}
		if (colFlag) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}
		if (rowFlag) {
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[0][i] = 0;
			}
		}
    }

	public static void main(String[] args){
		SetMatrixZeroes r = new SetMatrixZeroes();
		int[][] matrix = new int[][]{new int[]{1,2,3,4},new int[]{5,6,0,8}, new int[]{9,10,11,12}, new int[]{13,14,15,16}, new int[]{0,14,15,16}};
		r.setZeroes(matrix);
		System.out.println(matrix);
	}
}
