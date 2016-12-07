package chapter01;

/**
 * Created by laoli on 16/12/5.
 */
public abstract class Price {
    abstract int getPriceCode();
    abstract double getCharge(int daysRented);
}
