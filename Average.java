import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
				
		//10 students, 2 assignment, results + average
				
		Scanner sc = new Scanner(System.in);
		double[] grade1 = new double[10];
		double[] grade2 = new double[grade1.length];
		double[] result = new double[grade1.length];
					
				
		for(int i = 0; i < grade1.length; i++) {
			System.out.println("Enter your grade assignment 1, student " + (i+1));
			grade1[i] = sc.nextDouble();
			System.out.println("Enter your grade assignment 2, student " + (i+1));
			grade2[i] = sc.nextDouble();
					
			result[i] = (grade1[i] + grade2[i]) / 2;
	}
		
		System.out.println("Assignment 1: ");
		for(int i = 0; i < grade1.length; i++) {
		System.out.print(grade1[i] + " ");
	}
		System.out.println();
			
		System.out.println("Assignment 2: ");
		for(int i = 0; i < grade2.length; i++) {
		System.out.print(grade2[i] + " ");
	}
		System.out.println();
			
		System.out.println("Your semester average is:");
		for(int i = 0; i < grade1.length; i++) {
					
			if (result[i] >= 7){
				System.out.println(result[i] + "Approved");
				} else {
				System.out.println(result[i] + "Disapproved");
				}
			}
				
		sc.close();

	}

}