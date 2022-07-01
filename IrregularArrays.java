import java.util.Scanner;

public class IrregularArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of people interviewed: ");
		int numOfPeople = sc.nextInt();
		
		String [][] nameChildren = new String [numOfPeople][];

		for(int i=0; i<nameChildren.length; i++) {
			System.out.println("Enter the quantity of the children: ");
			int qntChildren = sc.nextInt();
			
			nameChildren[i] = new String[qntChildren];
			
		
			for(int j=0; j<nameChildren[i].length; j++) {
				System.out.println("Enter the name of the children " + (j+1) + ":");
				nameChildren[i][j]= sc.next();
			}
		}
		
		for(int i=0; i<nameChildren.length; i++) {
			System.out.println("Person " + i + " has " + nameChildren[i].length + " children/child"); 
			
			for(int j = 0; j<nameChildren[i].length; j++){
				System.out.println(nameChildren[i][j]);
				
			}
		}
		sc.close();
	}

}
