package MidTerm_UnitTest;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


class Inventory_Test {
	
	@Test
	void testInventory() {
		Inventory i = new Inventory();
		assertNull(i);
	}

	@Test
	void testDropInventoryItem() {
		Inventory items = new Inventory();
		InventoryItem item = new InventoryItem("Laptop", 5, "Dell 3510", 1);
		items.addItemToInventory(item);
		
		assertTrue(items.dropInventoryItem(item));
		
		assertFalse(items.dropInventoryItem(item));
	}

	@Test
	void testGetWeight() {// Spy object is used for this test to see if that real object responds the same output as tested.
		Inventory i = new Inventory();
		InventoryItem item1 = new InventoryItem("Computer", 4, "MacBook Pro", 1);
		InventoryItem item2 = new InventoryItem("TV", 12, "Samsung UHD", 2);

		InventoryItem item1Spy = spy(item1);
		InventoryItem item2Spy = spy(item2);
		
		i.addItemToInventory(item1Spy);
		i.addItemToInventory(item2Spy);

		verify(item1Spy, times(2)).getWeight();
		verify(item2Spy, times(1)).getWeight();
		assertEquals(12, i.getWeight());	
	}
	@Test
	void test_toString() {
		
		Inventory i = new Inventory();
		InventoryItem item1 = new InventoryItem("stationary", 5, "pencil", 1);
		InventoryItem item2 = new InventoryItem("accessory", 100, "remote", 1);
		i.addItemToInventory(item1);
		i.addItemToInventory(item2);
		
		assertEquals("Your inventory has:\t accessory remote, wt: 100" , i.toString());
	}
}