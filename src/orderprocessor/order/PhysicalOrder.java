package orderprocessor.order;

import java.util.HashMap;
import java.util.Map;

public class PhysicalOrder extends Order {
    public PhysicalOrder() {
    }

    public PhysicalOrder(String customerEmail) {
        super(customerEmail);
    }

    private String generateShippingLabel() {
        return String.format("%s's shipping label\n", this.customerEmail);
    }

    @Override
    public Map<String, String> generateOrderData() {
        Map<String, String> orderData = new HashMap<>(super.generateOrderData());
        orderData.put("shippingLabel", generateShippingLabel());

        return orderData;
    }

    @Override
    public String getCustomerMessage() {
        return "Your physical order has been shipped!";
    }
}
