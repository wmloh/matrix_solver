import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.swing.text.html.HTMLDocument.Iterator;

public class math {

	// computeGCD(x,y) returns the greatest common divisor of x and y
	public static int computeGCD(int x, int y) {
		if (x == 0) {
			return y;
		}
		if (y == 0) {
			return x;
		}
		else {
			return computeGCD(y, x % y);
		}
	}
	
	// computeFib(x) returns the value of the xth term of the Fibonacci sequence
	public static int computeFib (int x) {
		if (x == 0 | x == 1) {
			return 1;
		}
		else {
			return computeFib(x - 1) + computeFib(x - 2);
		}
	}
	
	// addFrac(x,y) returns a String in fraction form with the value of x + y
	public static String addFrac(String x, String y) {
		String num_x_str;
		String denum_x_str;
		String num_y_str;
		String denum_y_str;
		if(x.contains("/")) {
			num_x_str = x.split("/")[0];
			denum_x_str = x.split("/")[1];
		} else {
			num_x_str = x;
			denum_x_str = "1";
		}
		
		if(y.contains("/")) {
			num_y_str = y.split("/")[0];
			denum_y_str = y.split("/")[1];
		} else {
			num_y_str = y;
			denum_y_str = "1";
		}
		
		int num_x = Integer.parseInt(num_x_str);
		int denum_x = Integer.parseInt(denum_x_str);
		int num_y = Integer.parseInt(num_y_str);
		int denum_y = Integer.parseInt(denum_y_str);
		
		int num_output;
		int denum_output;
		
		if(denum_x != denum_y) {
			num_output = num_x * denum_y + num_y * denum_x;
			denum_output = denum_x * denum_y;
		} else {
			num_output = num_x + num_y;
			denum_output = denum_x;
		}
		
		int GCD = computeGCD(denum_output, num_output);
		if(GCD != 1) {
			num_output /= GCD;
			denum_output /= GCD;
		}
		
		if(denum_output == 1) {
			String output = String.format("%d", num_output);
			return output;
		}
		
		String output = String.format("%d/%d", num_output, denum_output);
		return output;
		
	}
	
	// subFrac(x,y) returns a String in fraction form with the value of x - y
	public static String subFrac(String x, String y) {
		String num_x_str;
		String denum_x_str;
		String num_y_str;
		String denum_y_str;
		if(x.contains("/")) {
			num_x_str = x.split("/")[0];
			denum_x_str = x.split("/")[1];
		} else {
			num_x_str = x;
			denum_x_str = "1";
		}
		
		if(y.contains("/")) {
			num_y_str = y.split("/")[0];
			denum_y_str = y.split("/")[1];
		} else {
			num_y_str = y;
			denum_y_str = "1";
		}
		
		int num_x = Integer.parseInt(num_x_str);
		int denum_x = Integer.parseInt(denum_x_str);
		int num_y = Integer.parseInt(num_y_str);
		int denum_y = Integer.parseInt(denum_y_str);
		
		int num_output;
		int denum_output;
		
		if(denum_x != denum_y) {
			num_output = num_x * denum_y - num_y * denum_x;
			denum_output = denum_x * denum_y;
		} else {
			num_output = num_x - num_y;
			denum_output = denum_x;
		}
		
		int GCD = computeGCD(denum_output, num_output);
		if(GCD != 1) {
			num_output /= GCD;
			denum_output /= GCD;
		}

		if(denum_output == 1) {
			String output = String.format("%d", num_output);
			return output;
		}
		
		String output = String.format("%d/%d", num_output, denum_output);
		return output;
		
	}

	// multFrac(x,y) returns a String in fraction form with the value of x * y
	public static String multFrac(String x, String y) {
		String num_x_str;
		String denum_x_str;
		String num_y_str;
		String denum_y_str;
		if(x.contains("/")) {
			num_x_str = x.split("/")[0];
			denum_x_str = x.split("/")[1];
		} else {
			num_x_str = x;
			denum_x_str = "1";
		}
		
		if(y.contains("/")) {
			num_y_str = y.split("/")[0];
			denum_y_str = y.split("/")[1];
		} else {
			num_y_str = y;
			denum_y_str = "1";
		}
		
		int num_x = Integer.parseInt(num_x_str);
		int denum_x = Integer.parseInt(denum_x_str);
		int num_y = Integer.parseInt(num_y_str);
		int denum_y = Integer.parseInt(denum_y_str);
		
		int num_output = num_x * num_y;
		int denum_output = denum_x * denum_y;
		
		int GCD = computeGCD(denum_output, num_output);
		if(GCD != 1) {
			num_output /= GCD;
			denum_output /= GCD;
		}

		if(denum_output == 1) {
			String output = String.format("%d", num_output);
			return output;
		}
		
		String output = String.format("%d/%d", num_output, denum_output);
		return output;
		
	}
	
	// divFrac(x,y) returns a String in fraction form with the value of x / y
	public static String divFrac(String x, String y) {
		String num_x_str;
		String denum_x_str;
		String num_y_str;
		String denum_y_str;
		if(x.contains("/")) {
			num_x_str = x.split("/")[0];
			denum_x_str = x.split("/")[1];
		} else {
			num_x_str = x;
			denum_x_str = "1";
		}
		
		if(y.contains("/")) {
			num_y_str = y.split("/")[0];
			denum_y_str = y.split("/")[1];
		} else {
			num_y_str = y;
			denum_y_str = "1";
		}
		
		int num_x = Integer.parseInt(num_x_str);
		int denum_x = Integer.parseInt(denum_x_str);
		int num_y = Integer.parseInt(num_y_str);
		int denum_y = Integer.parseInt(denum_y_str);
		
		int num_output = num_x * denum_y;
		int denum_output = denum_x * num_y;
		
		int GCD = computeGCD(denum_output, num_output);
		if(GCD != 1) {
			num_output /= GCD;
			denum_output /= GCD;
		}

		if(denum_output == 1) {
			String output = String.format("%d", num_output);
			return output;
		}
		
		String output = String.format("%d/%d", num_output, denum_output);
		return output;
		
	}
	
	// ref(mat) returns the REF (row echelon form) of mat
	// requires: coefficients of the solutions must be an int
	public static int[][] ref(int[][] mat) {
		int start = 0;
		int row_num = mat.length;
		int col_num = mat[0].length;
		while (start + 1 < row_num) {
			for (int i = start + 1; i < row_num; i++) {
				mat[i] = addRow(mat[i][start], mat[start],'-',mat[start][start], mat[i]);
				System.out.println(Arrays.toString(mat[i]));
			}
			start++;
		}
		
		
		for (int count = 0; count < row_num; count++) {
			for (int index = 0; index < col_num; index++) {
				if ((mat[count][index] != 1) && (mat[count][index] != 0)) {
					mat[count] = divScalar(mat[count][index], mat[count]);
					
					break;
				} else if (mat[count][index] == 1) {
					break;
				}
				
			}
		}
		return mat;
	}

	// ref_str(mat) returns the REF (row echelon form) of mat as a String array
	public static String[][] ref_str(int[][] mat_int) {
		
		int start = 0;
		int row_num = mat_int.length;
		int col_num = mat_int[0].length;
		
		String[][] mat = new String[row_num][col_num];
		for (int i = 0; i < row_num; i++) {
			for (int j = 0; j < col_num; j++) {
				mat[i][j] = Integer.toString(mat_int[i][j]);
			}
		}
		
		
		while (start + 1 < row_num) {
			for (int i = start + 1; i < row_num; i++) {
				mat[i] = addRow_str(mat[i][start], mat[start],'-',mat[start][start], mat[i]);
			}
			start++;
		}
		
		for (int count = 0; count < row_num; count++) {
			for (int index = 0; index < col_num; index++) {
				if (!(new String(mat[count][index]).equals("0")) && !(new String(mat[count][index]).equals("1"))) {
					mat[count] = divScalar_str(mat[count][index], mat[count]);
					break;
				} else if (new String(mat[count][index]).equals("1") ) {
					break;
				}
				
			}
		}
		return mat;
	}
	
	// addRow(c1, R1, ops, c2, R2) returns the row of c1 * R1 <ops> c2 * R2
	private static int[] addRow(int c1, int[] R1, char ops, int c2, int[] R2){
		
		if (R1.length == R2.length) {
			int[] output = new int[R1.length];
			if (ops == '-') {
				for (int i = 0; i < R1.length; i++) {
					output[i] = c1 * R1[i] - c2 * R2[i];
				}
				return output;
			} else if (ops == '+') {
				for (int i = 0; i < R1.length; i++) {
					output[i] = c1 * R1[i] + c2 * R2[i];
				}
				return output;
			}
		}
		
		return R1;
	}
	
	// divScalar(c, R) returns the row 1/c * R
	// requires: the coefficients of the evaluated form must be ints
	private static int[] divScalar(int c, int[] R) {
		int[] output = new int[R.length];
		for (int i = 0; i < R.length; i++) {
			output[i] = R[i] / c;
		}
		return output;
	}
	
	// addRow_str(c1, R1, ops, c2, R2) returns the row of c1 * R1 <ops> c2 * R2 in String
	private static String[] addRow_str(String c1, String[] R1, char ops, String c2, String[] R2){
		
		if (R1.length == R2.length) {
			String[] output = new String[R1.length];
			if (ops == '-') {
				for (int i = 0; i < R1.length; i++) {
					output[i] = subFrac(multFrac(c1, R1[i]), multFrac(c2, R2[i]));
				}
				return output;
			} else if (ops == '+') {
				for (int i = 0; i < R1.length; i++) {
					output[i] = addFrac(multFrac(c1, R1[i]), multFrac(c2, R2[i]));
				}
				return output;
			}
		}
		
		return null;
	}
	
	// divScalar(c, R) returns the row 1/c * R in String
	private static String[] divScalar_str(String c, String[] R) {
		String[] output = new String[R.length];
		for (int i = 0; i < R.length; i++) {
			output[i] = divFrac(R[i], c);
		}
		return output;
	}
	
	
	static int[][] test = {{3,1,-1,1},{2,5,1,2},{4,-1,3,0}};

	public static void main(String[] args) {
		System.out.println(Arrays.deepToString(ref_str(test)));
	}
}
