package orderprocessor;

import orderprocessor.order.Order;
import java.util.Map;

public abstract class OrderProcessor {
    public abstract Map<String, String> processOrder(Order order);
}
