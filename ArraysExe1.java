public class ArraysExe1 {

	public static void main(String[] args) {
		
		double [][] studentsGrade = new double [4][4];
		
		studentsGrade[0][0] = 10;
		studentsGrade[0][1] = 6;
		studentsGrade[0][2] = 5;
		studentsGrade[0][3] = 9;

		studentsGrade[1][0] = 5;
		studentsGrade[1][1] = 9;
		studentsGrade[1][2] = 5;
		studentsGrade[1][3] = 4;
		
		studentsGrade[2][0] = 10;
		studentsGrade[2][1] = 6;
		studentsGrade[2][2] = 5;
		studentsGrade[2][3] = 9;
		
		studentsGrade[3][0] = 10;
		studentsGrade[3][1] = 8;
		studentsGrade[3][2] = 7;
		studentsGrade[3][3] = 9;
		
		System.out.println();
		
		for (int i=0; i<studentsGrade.length; i++) {
			
			for(int j=0; j<studentsGrade[i].length; j++) {
				System.out.print(studentsGrade[i][j]+ " - ");
			}
			System.out.println();
		}
		System.out.println("Students Average");
		
		double add;
		for (int i=0; i<studentsGrade.length; i++) {
			add = 0;
			
			for(int j=0; j<studentsGrade[i].length; j++) {
				add += studentsGrade[i][j];
				
				System.out.println("The Average of Student " + i + " is = " + (add/4));
				
			}
		}
	}

}
