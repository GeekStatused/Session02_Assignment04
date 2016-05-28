import java.util.Scanner;

public class Assignment_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//sets user input
		Scanner month = new Scanner(System.in);
		
		//Asks for user to enter date.
		System.out.println("Please select a month");
		
		//Months of the year
		System.out.println("1. January");
		System.out.println("2. Februar");
		System.out.println("3. March");
		System.out.println("4. April");
		System.out.println("5. May");
		System.out.println("6. June");
		System.out.println("7. July");
		System.out.println("8. August");
		System.out.println("9. September");
		System.out.println("10. October");
		System.out.println("11. November");
		System.out.println("12. December");
		
		//variable to store user input
		int monthNum = month.nextInt();
		
		
		//Beginning of the switch statement
		switch(monthNum){
		
		//cases that represent the month. displays days of the month
		//depending on which month you pick.
		case 1:
			System.out.println("January has 31 days");
			break;
		case 2:
			System.out.println("February has 28 days");
			break;
		case 3:
			System.out.println("March has 31 days");
			break;
		case 4:
			System.out.println("April has 30 days");
			break;
		case 5:
			System.out.println("May has 31 days");
			break;
		case 6:
			System.out.println("June has 30 days");
			break;
		case 7:
			System.out.println("July has 31 days");
			break;
		case 8:
			System.out.println("August has 31 days");
			break;
		case 9:
			System.out.println("September has 30 days");
			break;
		case 10:
			System.out.println("October has 31 days");
			break;
		case 11:
			System.out.println("November has 30 days");
			break;
		case 12:
			System.out.println("December has 31 days");
			break;
		
		
		
		
		}
				

	}

}
