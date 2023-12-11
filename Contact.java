
public class Contact {
		
	private static int UNIQUE_ID_MAX_LENGTH = 10;
	private static int FIRSTNAME_MAX_LENGTH = 10;
	private static int LASTNAME_ID_MAX_LENGTH = 10;
	private static int PHONE_NUMBER_MAX_LENGTH = 10;
	private static int ADDRESS_MAX_LENGTH = 30;
	
	private String uniqueId;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private String address;
	
	Contact(String uniqueId, String phoneNumber, String firstName, String lastName, String address)
	{
		if (uniqueId.length() <= UNIQUE_ID_MAX_LENGTH)
			this.uniqueId = uniqueId; 
		if (address.length() <= ADDRESS_MAX_LENGTH)
			this.address = address;
		if (firstName.length() <= FIRSTNAME_MAX_LENGTH)
			this.firstName = firstName;
		if (firstName.length() <= FIRSTNAME_MAX_LENGTH)
			this.lastName = lastName;
		if (phoneNumber.length() <= PHONE_NUMBER_MAX_LENGTH)
			this.phoneNumber = phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		if (phoneNumber.length() <= PHONE_NUMBER_MAX_LENGTH)
			this.phoneNumber = phoneNumber;
	}
	public void setFirstName(String firstName)
	{
		if (firstName.length() <= FIRSTNAME_MAX_LENGTH)
			this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
		if (lastName.length() <= LASTNAME_ID_MAX_LENGTH)
			this.lastName = lastName;
	}
	public void setAddress(String address)
	{
		if (address.length() <= ADDRESS_MAX_LENGTH)
			this.address = address;
	}
	public String getUniqueId()
	{
		return (uniqueId);
	}
	public String getPhoneNumber()
	{
		return (phoneNumber);
	}
	public String getFirstName()
	{
		return (firstName);
	}
	public String getLastName()
	{
		return (lastName);
	}
	public String getAddress()
	{
		return (address);
	}
}
