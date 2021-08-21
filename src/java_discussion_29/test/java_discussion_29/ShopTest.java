package java_discussion_29;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    static Shop shop;
    static ShopService shopService;
    static List<Item> items;
    static Shop mockShop;

    @BeforeAll
    static void init(){
        Item mango = new Item(101, 20.5, "Mango");
        Item banana = new Item(102, 10.5, "Banana");

        items = new ArrayList<>();
        items.add(mango);
        items.add(banana);

        shopService = Mockito.mock(ShopService.class);
        shop = new Shop();
        mockShop = Mockito.mock(Shop.class);
    }


    @Test
    void setShopService() {
        Mockito.verify(mockShop, Mockito.times(0)).setShopService(shopService);
    }

    @Test
    void checkOutToPayment() {

        shop.setShopService(shopService);

        Mockito.when(shopService.calculatePrice(ArgumentMatchers.any(List.class))).thenReturn(31.0);

        assertEquals(46.5, shop.checkOutToPayment(items));

    }
}