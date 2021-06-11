package student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Utility {
	Scanner scan = new Scanner(System.in);
	private List<Crud> arr = new ArrayList<Crud>();
	
	public List<Crud> getList(){
		return this.arr;
	}
	
	public void createRecord() {
		HashSet<Integer> checkRoll = new HashSet<Integer>();
		System.out.println();
		
		// Roll Number
		System.out.println("Enter Roll No: ");
		int roll = scan.nextInt();
		
		if (this.arr.size() != 0) {
			for (Crud c : this.arr) {
				checkRoll.add(c.getRoll());
			}
			while(checkRoll.contains(roll)) {
				System.out.println("Roll number " + roll + " already exists !!!");
				System.out.println("Enter Roll No: ");
				roll = scan.nextInt();
			}
		}
		
		
		// First Name
		System.out.println();
		System.out.print("Enter First Name: ");
		String fName = scan.next();
		
		while(fName.length()<3 || fName.length() > 12) {
			System.out.println("First name should be of 2-12 character long !!!");
			System.out.print("Enter First Name: ");
			fName = scan.next();
		}
		
		
		// Last Name
		System.out.println();
		System.out.print("Enter Last Name: ");
		String lName = scan.next();
		
		while(lName.length()<3 || lName.length() > 12) {
			System.out.println("Last name should be of 2-12 character long !!!");
			System.out.print("Enter Last Name: ");
			lName = scan.next();
		}
		
		
		// Gender
		System.out.println();
		System.out.println("Select Gender: ");
		System.out.println("1. Male");
		System.out.println("2. Female");
		int gender = scan.nextInt();
		
		while (gender != 1 || gender != 2) {
			System.out.println("Invalid !!! Enter 1/2 only !!!");
			System.out.println("Select Gender: ");
			System.out.println("1. Male");
			System.out.println("2. Female");
			gender = scan.nextInt();
		}
		
		System.out.println("Enter Contact No. (Mobile Only): ");
		long contactNo = scan.nextLong();
		
		while (String.valueOf(contactNo).length() > 10 || String.valueOf(contactNo).length() < 1) {
			System.out.println("Invalid Mobile Number !!!");
			System.out.println("Enter Contact No. (Mobile Only): ");
			contactNo = scan.nextLong();
		}

	}
	
	public void displayList() {
		System.out.println();
		System.out.println();
		System.out.println("=================================");
		System.out.println("========= Student Lists =========");
		System.out.println("=================================");
		for (Crud obj : this.arr) {
            System.out.println(obj.getId() +obj.getName() + obj.getContact() + obj.getGender());
            System.out.println("-----------------------------");
        }
	}

}
