package alsoArrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		int i, index = 0;
		int array[] = {33, 43, 45, 57, 93, 22, 9, 11, 40};
		boolean found = false;
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to search in the array: \n");
		
		int value = sc.nextInt();
		sc.close();
		
		for (i = 0; i < array.length; i++) {
			if (array[i] == value ) {
				
				index = i;
				found = true;
				break;
			}
				
		}
		
		if (found) {
			System.out.println("\nThe number you search for is at index \"" + index + "\" of the array.");
		}
		else {
			System.out.println("\nThe number wasn't found in the array.");
		}
		

	}

}
