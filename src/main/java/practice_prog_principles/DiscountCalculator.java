package practice_prog_principles;

public class DiscountCalculator {
    private static final double LOYAL_FIRST_PURCHASE_DISCOUNT_RATE = 0.10;
    private static final double LOYAL_REPEAT_PURCHASE_DISCOUNT_RATE = 0.05;
    private static final double COUPON_DISCOUNT_RATE = 0.07;
    private static final double DEFAULT_DISCOUNT_RATE = 0.02;

    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        double discountRate = determineDiscountRate(isLoyalCustomer, isFirstPurchase, hasCoupon);
        double discountAmount = price * discountRate;

        return price - discountAmount;
    }
    private double determineDiscountRate(boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        if (isLoyalCustomer && isFirstPurchase)
            return LOYAL_FIRST_PURCHASE_DISCOUNT_RATE;
        else if (isLoyalCustomer)
            return LOYAL_REPEAT_PURCHASE_DISCOUNT_RATE;
        else if (hasCoupon)
            return COUPON_DISCOUNT_RATE;
        else
            return DEFAULT_DISCOUNT_RATE;
    }
}
