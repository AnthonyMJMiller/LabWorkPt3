package labWork;

import java.util.Scanner;

public class LabNumber3 {

	public static void main(String[] args) {
		Scanner num = new Scanner (System.in);
		int mainNum;
		String name;
		String confirm;
		
		do {
			System.out.println("Hi! May I have your name please?");
			
			name = num.nextLine();
			
			System.out.println("Okay " + name + ", please enter in a number between 1 and 100: ");
			
			mainNum = num.nextInt();
			
			if (mainNum<1 || mainNum>100) {
				System.out.println(name + ", make sure that the number entered is between 1 and 100.");
			}
			else {
				if ((mainNum % 2==0 && mainNum>=2 && mainNum<=25)) {
					System.out.println(mainNum + " is even and less than 25.");
					}
				else if ((mainNum % 2==0 && mainNum>=26 && mainNum<=60)) {
					System.out.println(mainNum + " is even " + name + ".");
				}
				else if ((mainNum % 2==0 && mainNum > 60)) {
					System.out.println(mainNum + " is even and greater than 60 " + name + ".");
				}
				else if ((mainNum % 2 !=0 && mainNum > 60)) {
					System.out.println(mainNum + " is odd and over 60 " + name + ".");
				}
				else {
					System.out.println(mainNum + " is odd " + name + "...just odd.");
				}
			}
			
			// Garbage line for scanner to clear
			num.nextLine();
			
				System.out.println("Would you like to enter in another number " + name + "? (Type 'Yes' to continue or type any other key to stop).");
				
				confirm = num.nextLine();
				
			}
			while (confirm.equalsIgnoreCase("Yes"));
				if (confirm != "Yes" && confirm != "yes") {
					System.out.println("Thank you for your participation " + name + ". Goodbye!");
		
		}
		
				num.close();
	}
}
