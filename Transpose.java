import java.util.Scanner;
public class Transpose{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	System.out.println("enter size of matrix: ");
	int r = s.nextInt();
	int c = s.nextInt();
	int[][] matrix = new int[r][c];

	System.out.println("enter the elements of matrix: ");
	for(int i=0; i<r; i++){
		for(int j=0; j<c; j++){
			matrix[i][j] = s.nextInt();
	}
	}
	
	System.out.println("original matrix: ");
	for(int i=0; i<r; i++){
		for(int j=0; j<c; j++){
			System.out.print(matrix[i][j] + " ");
	}
	System.out.println();
	}

	int[][] transpose = new int[c][r];
	for(int i=0; i<r; i++){
		for(int j=0; j<c; j++){
			transpose[j][i] = matrix[i][j];
	}
	}	

	System.out.println("transpose matrix: ");
	for(int i=0; i<c; i++){
		for(int j=0; j<r; j++){
			System.out.print(transpose[i][j] + " ");
	}
	System.out.println();
	}
	s.close();

	}
}