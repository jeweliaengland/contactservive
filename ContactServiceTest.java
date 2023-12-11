import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testAddContact() 
	{
		ContactService service = new ContactService();
		service.addContact();
		int index = 0;
		
		assertAll("constructor",
				()->assertEquals("123456789", service.getContactList().get(index).getUniqueId()),
				()->assertEquals("5088888888", service.getContactList().get(index).getPhoneNumber()),
				()->assertEquals("Jewelia", service.getContactList().get(index).getFirstName()),
				()->assertEquals("England", service.getContactList().get(index).getLastName()),
				()->assertEquals("1 main st ny", service.getContactList().get(index).getAddress()));
	}
	
	@Test
	public void testUpdatePhoneNumber()
	{
		ContactService service = new ContactService();
		service.addContact();
		int index = 0;
		assertEquals("5088888888", service.getContactList().get(index).getPhoneNumber());
		
	}
	
	@Test
	public void testUpdateLastName()
	{
		ContactService service = new ContactService();
		service.addContact();
		int index = 0;
		assertEquals("England", service.getContactList().get(index).getLastName());
		
	}
	
	@Test
	public void testUpdateFirstName()
	{
		ContactService service = new ContactService();
		service.addContact();
		int index = 0;
		assertEquals("Jewelia", service.getContactList().get(index).getFirstName());
		
	}
	
	@Test
	public void testUpdateAddress()
	{
		ContactService service = new ContactService();
		service.addContact();
		int index = 0;
		assertEquals("1 main st ny", service.getContactList().get(index).getAddress());
		
	}
	
	@Test
	public void testDeleteContact()
	{
		ContactService service = new ContactService();
		service.deleteContact(service.findContact("123456789"));
		assertNull(service.findContact("123456789"));

	}
}
