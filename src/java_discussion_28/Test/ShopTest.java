package java_discussion_28.Test;

import java_discussion_28.Item;
import java_discussion_28.Shop;
import java_discussion_28.ShopService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

class ShopTest {

    static ShopService shopService;
    static Shop shop;

    @BeforeAll
    static void init(){
        shopService = Mockito.mock(ShopService.class);
        shop = new Shop();
    }

    @Test
    void checkOutTest(){
       Item juice = new Item(101, "Juice", 15);
       Item potato = new Item(102, "Potato", 10);

        List<Item> items = new ArrayList<>();
        items.add(juice);
        items.add(potato);



//        Mockito.when(shopService.calculatePrice(items)).thenReturn(25.0);

//        Mockito.doReturn(25.0).when(shopService).calculatePrice(items);

        Mockito.doNothing().when(shopService).setItem(juice);

        shopService.setItem(juice);
        shopService.setItem(potato);

        Mockito.verify(shopService, Mockito.times(2)).setItem(ArgumentMatchers.any(Item.class));

//        assertEquals(25.0, shopService.calculatePrice(items));
    }


}