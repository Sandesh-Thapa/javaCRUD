package student.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import student.Utility;

public class Menu {
	static void defaultMsg() {
		System.out.println("Wrong choice !!!  Enter only 1/2/3/4/5/6/7/8");
		System.out.println("-------------------------------------------------");
	}
	public void menu()
	{
		Utility u = new Utility();
		while(true) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("=================================");
				System.out.println("=== Student Management System ===");
				System.out.println("=================================");
				System.out.println("1. Add Student");
				System.out.println("2. Display Student List");
				System.out.println("3. Search Student");
				System.out.println("4. Update Student Record");
				System.out.println("5. Delete Student Record");
				System.out.println("6. Exit");
				System.out.println("---------------------------------------------------------");
				System.out.println("Press the respective menu number for respective operation");
				System.out.print("Enter your choice: ");
				int choice = scan.nextInt();
				
				switch(choice) {
				case 1:
					u.createRecord();
					break;
				case 2:
					u.displayList();
					break;
				case 6:
					System.out.println("Have a great day !!!");
					System.exit(0);
				default: 
					defaultMsg();
					break;
				}
				scan.close();
			}catch (InputMismatchException e) {
				defaultMsg();
			}
		}
	}
}
