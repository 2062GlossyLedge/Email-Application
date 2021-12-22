/*
 * Create the email object
 * 
 * Ayden Smith
 * December 21, 2021
 */
package emailapp;

public class Email 
{
	private String password;
	private int mailboxCapacity;
	private String alternateEmail;
	private String firstName;
	private String lastName;
	private String email;
	public String department;
	
	// Constructor
	
	public Email(String f, String l, String d, int m)
	{
		this.firstName = f;
		this.lastName = l;
		this.department = d;
		this.mailboxCapacity = m;
		
	}

	// Method to generate email
	
	public void generateEmail()
	{
		email = firstName + "." + lastName + "@" + department + "." + "OscorpIndustries" + ".com";
		
	}

	// Method to Generate a random password
	
	public String generateRandomPassword()
	{
		String randomPassword = "";
		String letters = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i = 0; i < 6; i++)
		{
			int randomNum = (int) (Math.random() * (26)) + 0;
			char randomLetter = letters.charAt(randomNum);
			randomPassword += randomLetter;
			
		}
		
		return randomPassword;
	}

	// Method to change password
	
	public void changePassword(String a)
	{
		password = a;
	}
	

	// set mailbox capacity Method
	
	public void setMailBoxCapacity(int a)
	{
		mailboxCapacity = a;
	}

	// set alternate email Method
	
	public void setAlternateEmail(String a)
	{
		alternateEmail = a;
		
	}

	// get name Methods
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}

	// get email Method
	
	public String getEmail()
	{
		return email;
	}

	// get mailbox capacity method 
	
	public int getMailboxCapacity()
	{
		return mailboxCapacity;
	}
	
	// get department
	
	public String getDepartment()
	{
		return department;
	}


}

