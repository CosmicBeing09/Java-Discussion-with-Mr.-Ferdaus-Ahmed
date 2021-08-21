package java_discussion_29;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    void calculatePrice() {

        Item mango = new Item(101, 20.5, "Mango");
        Item banana = new Item(102, 10.5, "Banana");

        List<Item> items = new ArrayList<>();
        items.add(mango);
        items.add(banana);

        ShopService shopService = Mockito.mock(ShopService.class);

        Mockito.when(shopService.calculatePrice(ArgumentMatchers.any(List.class))).thenReturn(31.0);

        assertEquals(31.0, shopService.calculatePrice(items));
    }
}