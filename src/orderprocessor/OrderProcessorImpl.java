package orderprocessor;

import orderprocessor.order.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderProcessorImpl extends OrderProcessor{
    @Override
    public Map<String, String> processOrder(Order order) {
        return order.generateOrderData();
    }
}
