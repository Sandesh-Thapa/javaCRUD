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
		
		while (gender != 1 && gender != 2) {
			System.out.println("Invalid !!! Enter 1/2 only !!!");
			System.out.println("Select Gender: ");
			System.out.println("1. Male");
			System.out.println("2. Female");
			gender = scan.nextInt();
		}
		String finalGender = "M";
		switch(gender) {
		case 1:
			finalGender = "M";
			break;
		case 2:
			finalGender = "F";
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
		System.out.println("Enter Contact No. (Mobile Only): ");
		long contactNo = scan.nextLong();
		int contactLen = String.valueOf(contactNo).length();
		
		while (contactLen != 10) {
			System.out.println("Invalid Mobile Number !!!");
			System.out.println("Enter Contact No. (Mobile Only): ");
			contactNo = scan.nextLong();
			contactLen = String.valueOf(contactNo).length();
		}
		
		Crud c = new Crud(roll, fName, lName, finalGender, contactNo, this.getList());
		this.arr.add(c);

	}
	
	public void displayList() {
		System.out.println();
		System.out.println();
		System.out.println("=================================");
		System.out.println("========= Student Lists =========");
		System.out.println("=================================");
		for (Crud obj : this.arr) {
            System.out.println(obj.getId() + " " +obj.getName() + " " + obj.getContact() + " " + obj.getGender() + " " + obj.getRoll());
            System.out.println("-----------------------------");
        }
	}
	
	public void searchRecord() {
		Boolean found = false;
		System.out.print("Enter Roll number of student: ");
		int roll = scan.nextInt();
		
		for (Crud c : this.arr) {
			if (c.getRoll() == roll) {
				found = true;
				System.out.println("Record Found !!");
				System.out.println("Roll no: " + c.getRoll());
				System.out.println("Name: " + c.getName());
				System.out.println("Gender: " + c.getGender());
				System.out.println("Contact: " + c.getContact());
				break;
			}
		}
		if(!found) {
			System.out.println("Record Not Found !!");
		}
		
	}
	
	public void deleteRecord() {
		Boolean found = false;
		System.out.print("Enter Roll number of student to delete: ");
		int roll = scan.nextInt();
		for (Crud c : this.arr) {
			if (c.getRoll() == roll) {
				found = true;
				this.arr.remove(c);
				System.out.println("Record Deleted Successfully !!!");
				break;
			}
		}
		if(!found) {
			System.out.println("Record Not Found !!");
		}
		
	}

	public void updateRecord() {
		HashSet<Integer> checkRoll = new HashSet<Integer>();
		Boolean found = false;
		Crud record;
		System.out.print("Enter Roll number of student: ");
		int roll = scan.nextInt();
		
		for (Crud c : this.arr) {
			checkRoll.add(c.getRoll());
			if (c.getRoll() == roll) {
				found = true;
				record = c;
			}
		}
		
		if(!found) {
			System.out.println("Record Not Found !!");
		}else {
			System.out.println("Record Found ...");
			System.out.println("Enter new Roll No: ");
			int newRoll = scan.nextInt();
			
			while(checkRoll.contains(newRoll)) {
				System.out.println("Roll number " + newRoll + " already exists !!!");
				System.out.println("Enter Roll No: ");
				newRoll = scan.nextInt();
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
			
			while (gender != 1 && gender != 2) {
				System.out.println("Invalid !!! Enter 1/2 only !!!");
				System.out.println("Select Gender: ");
				System.out.println("1. Male");
				System.out.println("2. Female");
				gender = scan.nextInt();
			}
			String finalGender = "M";
			switch(gender) {
			case 1:
				finalGender = "M";
				break;
			case 2:
				finalGender = "F";
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			
			System.out.println("Enter Contact No. (Mobile Only): ");
			long contactNo = scan.nextLong();
			int contactLen = String.valueOf(contactNo).length();
			
			while (contactLen != 10) {
				System.out.println("Invalid Mobile Number !!!");
				System.out.println("Enter Contact No. (Mobile Only): ");
				contactNo = scan.nextLong();
				contactLen = String.valueOf(contactNo).length();
			}
			
			Crud newRecord = new Crud(newRoll, fName, lName, finalGender, contactNo, this.getList());
			
			for (int i=0; i<this.arr.size(); i++) {
				if (this.arr.get(i).getRoll() == roll) {
					this.arr.set(i, newRecord);
					System.out.println("Record Updated Successfully ...");
					break;
				}
			}
		}
	}
}
