package arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int size = 9, i;
		int[] array = new int[size];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an array of intergers of size 9: ");
		
		for (i = 0; i < array.length; i++) {
			
			System.out.println("Enter value at index \"" + i + "\" : ");
			array[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("\n");
		
		for (i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
		}

	}

}
