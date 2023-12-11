import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {
	
	
	@Test
	void testConstructor() 
	{
		Contact contact = new Contact("123456789", "5088888888", "Jewelia", "England", "1 main st ny");
		assertAll("constructor",
				()->assertEquals("123456789", contact.getUniqueId()),
				()->assertEquals("5088888888", contact.getPhoneNumber()),
				()->assertEquals("Jewelia", contact.getFirstName()),
				()->assertEquals("England", contact.getLastName()),
				()->assertEquals("1 main st ny", contact.getAddress()));
	}

	@Test
	public void testSetPhoneNumber()
	{
		Contact contact = new Contact("123456789", "5088888888", "Jewelia", "England", "1 main st ny");
		contact.setPhoneNumber("5088888887");
		assertEquals("5088888887", contact.getPhoneNumber());
	}
	@Test
	public void testSetFirstName()
	{
		Contact contact = new Contact("123456789", "5088888888", "Jewelia", "England", "1 main st ny");
		contact.setFirstName("Andrew");
		assertEquals("Andrew", contact.getFirstName());
	}
	@Test
	public void testSetLastName()
	{
		Contact contact = new Contact("123456789", "5088888888", "Jewelia", "England", "1 main st ny");
		contact.setLastName("Kustov");
		assertEquals("Kustov", contact.getLastName());
	}
	@Test
	public void testSetAddress()
	{
		Contact contact = new Contact("123456789", "5088888888", "Jewelia", "England", "1 main st ny");
		contact.setAddress("1 main st NY");
		assertEquals("1 main st NY", contact.getAddress());
	}
	@Test
	public void testGetPhoneNumber()
	{
		Contact contact = new Contact("123456789", "5088888888", "Jewelia", "England", "1 main st ny");

		assertEquals("5088888888", contact.getPhoneNumber());
	}
	@Test
	public void testGetFirstName()
	{
		Contact contact = new Contact("123456789", "5088888888", "Jewelia", "England", "1 main st ny");

		assertEquals("Jewelia", contact.getFirstName());
	}
	@Test
	public void testGetLastName()
	{
		Contact contact = new Contact("123456789", "5088888888", "Jewelia", "England", "1 main st ny");

		assertEquals("England", contact.getLastName());
	}
	@Test
	public void testGetAddress()
	{
		Contact contact = new Contact("123456789", "5088888888", "Jewelia", "England", "1 main st ny");
		assertEquals("1 main st ny", contact.getAddress());
	}
}
