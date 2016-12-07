package chapter01;

/**
 * Created by laoli on 16/12/5.
 */
public class RegularPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    double getCharge(int daysRented) {
        double result=2;
        if (daysRented>2){
            result+=(daysRented-2)*1.5;
        }
        return result;
    }
}
