import java.util.ArrayList;
import java.util.List;

public class ContactService 
{

	private List<Contact> contactList = new ArrayList<>();
	
	public void addContact()
	{
		Contact contact = new Contact("123456789", "5088888888", "Jewelia", "England", "1 main st ny");
		contactList.add(contact);
	}
	public void updatePhoneNumber(String id, String newPhoneNumber)
	{
		findContact(id).setPhoneNumber(newPhoneNumber);
		
	}
	public void updateFirstname(String id, String newFirstName)
	{
		findContact(id).setFirstName(newFirstName);
		
	}
	public void updateLastname(String id, String newLastName)
	{
		findContact(id).setLastName(newLastName);
		
	}
	public void updateAddress(String id, String newAddress)
	{
		findContact(id).setAddress(newAddress);
		
	}
	public void deleteContact(Contact contact)
	{
		if (contact != null)
		{
			contactList.remove(contact);
		}
	}
	public Contact findContact(String id)
	{
		int index = 0;
		while(index < contactList.size())
		{
			if (id.equals(contactList.get(index).getUniqueId()))
			{
				return(contactList.get(index));
			}
			index++;
		}
		return(null);
	}
	public List<Contact> getContactList()
	{
		return contactList;
	}

}
