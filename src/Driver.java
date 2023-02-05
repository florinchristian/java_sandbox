import orderprocessor.OrderProcessorImpl;
import orderprocessor.order.PhysicalOrder;
import orderprocessor.proxy.EmailedOrderProcessor;

public class Driver {
    public static void main(String[] args) {
        PhysicalOrder order = new PhysicalOrder();
        order.setCustomerEmail("gflorincristi@gmail.com");

        OrderProcessorImpl simpleProcessor = new OrderProcessorImpl();
        EmailedOrderProcessor orderProcessor = new EmailedOrderProcessor(simpleProcessor);

        System.out.println(simpleProcessor.processOrder(order));

        System.out.println();

        System.out.println(orderProcessor.processOrder(order));
    }
}
