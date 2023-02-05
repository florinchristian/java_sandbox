package orderprocessor.order;

public class DigitalOrder extends Order {
    public DigitalOrder() {
    }

    DigitalOrder(String customerEmail) {
        super(customerEmail);
    }

    @Override
    public String getCustomerMessage() {
        return "Your digital order is ready for download";
    }
}
