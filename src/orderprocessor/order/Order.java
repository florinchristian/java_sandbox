package orderprocessor.order;

import java.util.HashMap;
import java.util.Map;

public abstract class Order {
    protected String customerEmail;
    protected String customerMessage;

    public Order() {
    }

    Order(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public abstract String getCustomerMessage();

    public String generateInvoice() {
        return String.format("%s's invoice", customerEmail);
    }

    public Map<String, String> generateOrderData() {
        return new HashMap<String, String>() {{
           put("invoice", generateInvoice());
        }};
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
