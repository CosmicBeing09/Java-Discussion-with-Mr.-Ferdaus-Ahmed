package java_discussion_29;

import java.util.List;

public class Shop {
    ShopService shopService;

    void setShopService(ShopService shopService){
        this.shopService = shopService;
    }

    double checkOutToPayment(List<Item> items){
        return shopService.calculatePrice(items) + ((50.0/100.0) * shopService.calculatePrice(items));
    }
}
