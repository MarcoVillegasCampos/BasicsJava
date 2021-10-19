import java.util.ArrayList;

public class BasicJavaTest {
	public static void main(String[] args) {
	
		
			
	}
	public static void NumbersTo255() {
		for(int i = 0; i <= 255; i++)
			System.out.println(i);
	}



	public static void oddNumbers() {
		for(int i = 0; i <= 255; i++) {
			if(i % 2 == 0)
				System.out.println(i);
		}
	}

	public static int sum(int[] number) {
		int sum = 0;
		for(int i = 0; i < number.length; i++) {
			sum += number[i];			
		}
		return sum;
	}

	public static void Array(int[] array) {
		for(int val: array)
			System.out.println(val);
	}


	
	public static int FindMax(int[] array) {
		int maxNum = Integer.MIN_VALUE;
		for(int val: array){
			if(val > maxNum)
				maxNum = val;
		}
		return maxNum;
	}
	public static ArrayList<Integer>ArrayWithOdd() {
		ArrayList<Integer> y = new ArrayList<Integer>();
		for(int i = 0; i <= 255; i++) {
			if(i % 2 != 0)
				y.add(i);
		}
		return y;
	}

	public static double GetAverage(int[] array) {
		int sum = sum(array);
		double average =(double)sum/array.length;
		System.out.println("Sum:" + sum+" Average:"+ average);
		return average;
	}

	public static int GreaterThanY(int[] array, int y) {
		int counter = 0;
		for(int num: array) {
			if(num > y)
				counter++;
		}
		return counter;
	}
	public static void SquareValues(int[] number) {
		for(int i = 0; i < number.length; i++) {
			number[i] = number[i] * number[i];	
		}
	}
	public static void EliminateNegatives(int[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] < 0)
				array[i] = 0;
		}
	}

}

