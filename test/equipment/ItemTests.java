package equipment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import equpiment.Item;

class ItemTests {

	@Test
    public void defaultItemNonameAndWeightOneKg()
    {
        Item item = new Item();
        Assertions.assertEquals("noname 1.0", item.toString());
    }

    @Test
    public void constructItemWithSpecificValuesFromZeroToTen()
    {
        Item item = new Item("SomeItem", 10);
        Assertions.assertEquals("SomeItem 10.0", item.toString());
    }

    @Test
    public void constructItemWithWrongWeightAndSetWeightOnOne()
    {
        Item item = new Item("SomeItem", 14);
        Assertions.assertEquals("SomeItem 1.0", item.toString());
    }

    @Test
    public void constructItemAndReturnWeight()
    {
        Item item = new Item("SomeItem", 8);
        Assertions.assertEquals(8, item.getWeight());
    }
    
    @Test
    public void constructItemAndReturnName()
    {
        Item item = new Item("SomeItem", 1);
        Assertions.assertEquals("SomeItem", item.getName());
    }

}
