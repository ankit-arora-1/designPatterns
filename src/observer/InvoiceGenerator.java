package observer;

public class InvoiceGenerator implements OrderPlacedSubscriber {

    public InvoiceGenerator() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public ReturnData announceOrderPlaced() {
        generateInvoice();
        return null;
    }


    public void generateInvoice() {
        System.out.println("Generating Invoice");
    }
}
