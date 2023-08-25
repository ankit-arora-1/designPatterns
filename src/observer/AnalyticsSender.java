package observer;

public class AnalyticsSender implements OrderPlacedSubscriber, OrderCancelledSubscriber {

    public AnalyticsSender() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public ReturnData announceOrderPlaced() {
        System.out.println("Updating analaytics");
        return null;
    }

    @Override
    public void announceOrderCancelled() {

    }
}

UIEventManager

SubscriberManager {
    triggerUnreisterEvnt() {

    }
}
