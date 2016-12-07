package chapter01;

/**
 * Created by laoli on 16/12/5.
 */
public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented) {
        return daysRented*3;
    }
}
