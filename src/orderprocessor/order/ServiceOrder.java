package orderprocessor.order;

public class ServiceOrder extends Order {
    public ServiceOrder() {
    }

    ServiceOrder(String customerEmail) {
        super(customerEmail);
    }

    @Override
    public String getCustomerMessage() {
        return "Your service order has been scheduled";
    }
}
