package java_discussion_29;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;


import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    static Item item;
    static Item mockItem;

    @BeforeAll
    static void init(){
        item = new Item(101, 20.5, "Mango");
        mockItem = Mockito.mock(Item.class);
    }

    @Test
    void getId() {
        assertEquals(101, item.getId());
    }

    @Test
    void setId() {
        mockItem.setId(102);
        mockItem.setId(103);
        Mockito.verify(mockItem, Mockito.times(2)).setId(ArgumentMatchers.anyInt());
    }

    @Test
    void getPrice() {
        assertEquals(20.5, item.getPrice());
    }

    @Test
    void setPrice() {
        Mockito.verify(mockItem, Mockito.times(0)).setPrice(22.5);
    }

    @Test
    void getName() {
        assertEquals("Mango", item.getName());
    }

    @Test
    void setName() {
        Mockito.verify(mockItem, Mockito.times(0)).setName("Potato");
    }
}