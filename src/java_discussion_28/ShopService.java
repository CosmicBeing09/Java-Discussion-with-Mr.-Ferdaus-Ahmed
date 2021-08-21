package java_discussion_28;
import java.util.List;

public interface ShopService {
    double calculatePrice(List<Item> items);

    void setItem(Item item);
}
