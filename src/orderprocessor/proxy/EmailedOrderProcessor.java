package orderprocessor.proxy;

import com.sun.istack.internal.NotNull;
import orderprocessor.OrderProcessor;
import orderprocessor.email.EmailProcessor;
import orderprocessor.order.Order;

import java.util.Map;

public class EmailedOrderProcessor extends OrderProcessor {
    OrderProcessor orderProcessor;
    EmailProcessor emailProcessor;

    public EmailedOrderProcessor(OrderProcessor orderProcessor) {
        emailProcessor = new EmailProcessor();
        this.orderProcessor = orderProcessor;
    }

    @Override
    public Map<String, String> processOrder(Order order) {
        emailProcessor.sendEmail(order.getCustomerEmail(), order.getCustomerMessage());
        return orderProcessor.processOrder(order);
    }
}
