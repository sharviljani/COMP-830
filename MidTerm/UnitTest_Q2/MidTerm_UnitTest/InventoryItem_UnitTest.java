package MidTerm_UnitTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class InventoryItem_UnitTest {

	InventoryItem item;

	@BeforeEach
	public void setUp() {
		item = new InventoryItem("Laptop Notebook", 2, "Apple MacBook Air", 3);
	}

	@Test
	public void Test() {
		
		InventoryItem spy = Mockito.spy(item);
		// create a regular mock object values to be added later
		InventoryItem mock = Mockito.mock(InventoryItem.class);
		
		// add values to the mock object
		Mockito.when(mock.getName()).thenReturn("Apple MacBook Air");
		Mockito.when(mock.getWeight()).thenReturn(2);
		Mockito.when(mock.getCount()).thenReturn(3);
		Mockito.when(mock.getType()).thenReturn("Laptop Notebook");
		
		// assert the mock object to the spy object
		assertEquals(mock.getName(), spy.getName());
		assertEquals(mock.getWeight(), spy.getWeight());
		assertEquals(mock.getCount(), spy.getCount());
		assertEquals(mock.getType(), spy.getType());

	}
	
	public void testToString() {
		InventoryItem item = new InventoryItem("Animal", 20, "cat", 2);
		assertEquals("Animal cat, wt: 20" , item.toString());
		item.count = 5;
		assertEquals("Animal cat, wt: 20, there are only 5 left" , item.toString());
	}
}







