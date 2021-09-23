import java.util.Scanner;
import java.util.Arrays;
public class question2 {

	public static void main(String[] args) {
		double values[] = new double[10];
		int currentSize = 0;
		//importing scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Input values for array then press 'Q' to start the program!");
		
		//allowing for input and termination of input for the variables in the array
		while(in.hasNextDouble() && currentSize < values.length){
			values[currentSize] = in.nextDouble();
			currentSize++;
			
		}
		//Printing every element in the index
			for(int i = 0; i < values.length; i++) {
			System.out.print(values[i] + " ");
		}
		
		//Printing even number in array using a for each loop
			for(double evens : values) {
			if (evens % 2 == 0) {
				System.out.println(evens);
			}
		}
		
		//Printing odd number in array using a standard for loop	
			for(int i = 0; i < values.length; i++) {
			if(!(values[i] % 2 == 0)) {
				System.out.println(values[i] + " ");
			}
		}	
			//Printing elements in reverse order
			 for (int i = values.length-1; i >= 0; i--) {  
		            System.out.println(values[i] + " ");  
		        } 
			 //Printing only the first, fifth, and last element
			 System.out.println(values[0] + " " + values[4] + " " + values[9]);
			
			 //Finding and printing the largest and the smallest value
			double largest = values[0];
			double smallest = values[0];
			for (int i = 1; i < currentSize; i++) {
				if(values[i] > largest) {
					largest = values[i];
				}
			}
			for (int i = 1; i < currentSize; i++) {
				if(values[i] < smallest) {
					smallest = values[i];
					
				}
			}
			System.out.println("The smallest number is: " + smallest);
			System.out.println("The largest number is: " + largest);
			
			
			//Finding and printing the alternating sum of all elements
			double altSum = values[0];
			for (int i = 1; i < values.length; i++) {
				if(values[i] % 2 == 0) {
					altSum = altSum - values[i];
				}else if(!(values[i] % 2 == 0)) {
					altSum = altSum + values[i];
				}
				
			}
			System.out.println(altSum);
			
			
			
			
			
			//System.out.println("The alternating sum is :" values[0]-values[1]+values[2]-values[3]+values[4]-values[5]+values[6]-values[7]+values[8]-values[9]);
	}
}
		
		
		
		

	


