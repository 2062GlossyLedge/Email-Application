/*
 * Test the email object and the getters and setters of the Email class
 * 
 * Ayden Smith
 * December 21, 2021
 */
package emailapp;

import java.util.Scanner;

public class EmailApp 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your first name? ");
		String firstName = input.next();
		System.out.println("What is your last name? ");
		String lastName = input.next();
		System.out.println("What is your department? ");
		String departmentName = input.next();
		
		// Generate a new email for the new employee
		Email a = new Email(firstName, lastName, departmentName, 100);
		
		// Greet the new employee. Tell them their new job email, email password, and their mailbox capacity. 
		// Give the new employee a choice to set an alternate email. 
		
		System.out.println("Hello " + firstName + " " + lastName + " of the " + departmentName + " deparment");
		
		a.generateEmail();
		System.out.println("Your job email is: " + a.getEmail());
		
		System.out.println("The password for the email is: " + a.generateRandomPassword());
		
		System.out.println("Your mailbox capacity is: " + a.getMailboxCapacity());
		
		System.out.println("Would you like to set an alternate email? (Y/N): ");
		String choice = input.next();
		
		if (choice.equals("Y"))
		{
			System.out.println("Type in your chosen alternate email: ");
			String alternateEmail = input.next();
			a.setAlternateEmail(alternateEmail);
		}
		else
		{
			
		}
		
		System.out.println("Have a nice day!");
		
		
		

	}

}
