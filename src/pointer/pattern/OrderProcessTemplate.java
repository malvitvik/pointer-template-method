package pointer.pattern;

public abstract class OrderProcessTemplate {

    private boolean isGift;

    public boolean isGift() {
        return isGift;
    }

    public abstract void doSelect();

    public abstract void doPayment();

    public final void giftWrap() {
        try {
            System.out.println("Gift wrap successful");
        } catch (Exception e) {
            System.out.println("Gift wrap unsuccessful");
            this.isGift = false;
        }
    }

    public abstract void doDelivery();

    public final void processOrder(boolean isGift) {
        this.isGift = isGift;

        doSelect();
        doPayment();
        if (isGift) {
            giftWrap();
        }
        doDelivery();
    }
}
