import java.util.InputMismatchException;
import java.util.Scanner;

import DTO.ListDTO;
import components.ListByActiveUsers;
import components.ListByTimeSpent;
import components.ListByVisits;
import components.MyList;

public class Main {
	static MyList list;
	static Scanner scan;

	public static String getRange() {
		while (true) {
			try {
				System.out.println("Choose filter : \n1.DAILY, \n2.MONTHLY, \n3.QUATERLY");
				switch (scan.nextInt()) {
				case 1: {
					return "DAILY";
				}
				case 2: {
					return "MONTHLY";

				}
				case 3: {
					return "QUATERLY";
				}
				default: {
					System.out.println("Invalid option ,Select Again!!");
				}
				}
			} catch (InputMismatchException exception) {
				System.out.println("Kindly type numeric value !!" + exception);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Analysis System.");
		System.out.println("Kindly choose the options from below :");
		while (true) {
			System.out.println("1.List of Most Visited Pages");
			System.out.println("2.List of Most Spent Time On Pages");
			System.out.println("3.List of Top Active Users");
			scan = new Scanner(System.in);
			try {
				int mainList = scan.nextInt();
				switch (mainList) {
				case (1): {
					list = new ListByVisits();
					System.out.println(list.getList(getRange()));
					break;
				}
				case (2): {
					list = new ListByTimeSpent();
					System.out.println(list.getList(getRange()));
					break;
				}
				case (3): {
					list = new ListByActiveUsers();
					System.out.println(list.getList(getRange()));
					break;
				}
				default: {
					System.out.println("Invalid option !!");
				}
				}
			} catch (InputMismatchException exception) {
				System.out.println("Kindly type numeric value !!" + exception);
			}

		}
	}

}
