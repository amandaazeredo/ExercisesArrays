import java.util.Scanner;

public class Schedule {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] commitment = new String[31][24];
		
		boolean exit = false;
		byte op;
		
		while(!exit) {
			System.out.println("Type 1 to add commitment.");
			System.out.println("Type 2 to check a commitment.");
			System.out.println("Type 0 to exit");
			
			op = sc.nextByte();
			
			if(op == 1) {
				
				boolean validDay = false;
				int day = 0;
				
				while(!validDay) {
					System.out.println("Enter a day: ");
					day = sc.nextInt();
					if(day > 0 && day < 31) {
						validDay = true;
					}
				}
				
				boolean validHour = false;
				int hour = 0;
				
				while(!validHour) {
					System.out.println("Enter an hour: ");
					hour = sc.nextInt();
					if(hour >= 0 && hour <= 24) {
						validHour = true;
					}
				}
				System.out.println("Enter the commitment: ");
				day--;
				commitment[day][hour] = sc.next();
				
			} else if (op == 2) {
				
				boolean validDay = false;
				int day = 0;
				
				while(!validDay) {
					System.out.println("Enter a day: ");
					day = sc.nextInt();
					if(day > 0 && day < 31) {
						validDay = true;
					}
				}
				
				boolean validHour = false;
				int hour = 0;
				
				while(!validHour) {
					System.out.println("Enter an hour: ");
					hour = sc.nextInt();
					if(hour >= 0 && hour <= 24) {
						validHour = true;
					}
				}
				
				day--;
				System.out.println("Scheduled appointment is: ");
				System.out.println(commitment[day][hour]);
				
			} else if (op == 0) {
				exit = true;
			} else {
				System.out.println("Invalid");
			}
		}
		sc.close();
	}
	
}
