package java_discussion_28;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    ShopService shopService;


    double checkOut(){

        Item juice = new Item(101, "Juice", 15);
        Item potato = new Item(102, "Potato", 10);

        List<Item> items = new ArrayList<>();
        items.add(juice);
        items.add(potato);

        return shopService.calculatePrice(items) + (shopService.calculatePrice(items) * (50.0/100.0));

//        return 2 * shopService.calculatePrice(items);
    }
}
