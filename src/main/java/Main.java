import java.util.InputMismatchException;
import java.util.Scanner;

import DTO.ListDTO;
import components.ListByTimeSpent;
import components.ListByVisits;
import components.MyList;

public class Main {
	static MyList list;
	static Scanner scan;

	enum Catagory {
		DAILY, MONTHLY, QUATERLY
	}

	public static ListDTO getRange() {
		System.out.println("Choose filter : DAILY, MONTHLY, QUATERLY");
		String cat="";
		switch (Catagory.valueOf(scan.next())) {
		case DAILY: {
			cat = "Daily";
			break;
		}
		case MONTHLY: {
			cat = "Monthly";
			break;
		}
		case QUATERLY: {
			cat = "Quaterly";
			break;
		}
		default: {
			System.out.println("Invalid option !!");
		}
		}
		try {
			System.out.println("1.List of Most Visited Pages");
			System.out.println("2.List of Most Spent Time On Pages");
			System.out.println("3.List of Top Active Users");
			int secondList = scan.nextInt();
			switch (secondList) {
			case (1): {
				list = new ListByVisits();
				System.out.println(list.getListByRange(cat));
				break;
			}
			case (2): {
				list = new ListByTimeSpent();
				System.out.println(list.getListByRange(cat));
				break;
			}
			case (3): {
				list = new ListByVisits();
				System.out.println(list.getListByRange(cat));
				break;
			}
			default: {
				System.out.println("Invalid option !!");
			}
			}
		} catch (InputMismatchException exception) {
			System.out.println("Kindly type numeric value !!" + exception);
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the Analysis System.");
		System.out.println("Kindly choose the options from below :");
		while (true) {
			System.out.println("1.List of Most Visited Pages");
			System.out.println("2.List of Most Spent Time On Pages");
			System.out.println("3.List of Top Active Users");
			System.out.println("4.Get List by Filter");
			scan = new Scanner(System.in);
			try {
				int mainList = scan.nextInt();
				switch (mainList) {
				case (1): {
					list = new ListByVisits();
					System.out.println(list.getList());
					break;
				}
				case (2): {
					list = new ListByTimeSpent();
					System.out.println(list.getList());
					break;
				}
				case (3): {
					list = new ListByVisits();
					System.out.println(list.getList());
					break;
				}
				case (4): {
					System.out.println(getRange());
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
