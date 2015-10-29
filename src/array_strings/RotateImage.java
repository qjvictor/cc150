package array_strings;
/**
 * rotate an image by 90 degrees in place.
 * You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Follow up:
Could you do this in-place?
 * @author VictorQian
 *
 */
public class RotateImage {
	public void rotate(int[][] matrix){
		if(matrix==null || matrix[0]==null || matrix.length==0 || matrix[0].length==0 || matrix.length!=matrix[0].length)
			return;
		int n = matrix.length;
		
		for(int i=0;i<n;i++){//row
			for(int j=0;j<n;j++){//col
				if(i<j) swap(matrix, i, j, j, i);
			}
		}
		
		for(int i=0;i<n;i++){//row
			for(int j=0;j<n/2;j++){//col
				swap(matrix,i, j, i, n-j-1);
			}
		}
	}
	
	private void swap(int[][] matrix, int i1, int j1, int i2, int j2){
		int tmp = matrix[i1][j1];
		matrix[i1][j1] = matrix[i2][j2];
		matrix[i2][j2]=tmp;
	}
	
	public static void main(String[] args){
		RotateImage r = new RotateImage();
		int[][] matrix = new int[][]{new int[]{1,2,3,4},new int[]{5,6,7,8}, new int[]{9,10,11,12}, new int[]{13,14,15,16}};
		r.rotate(matrix);
		System.out.println(matrix);
	}
}
