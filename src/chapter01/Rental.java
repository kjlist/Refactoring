package chapter01;

/**
 * Created by laoli on 16/12/1.
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie _movie, int _daysRented) {
        this._movie = _movie;
        this._daysRented = _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDayRented() {
        return _daysRented;
    }

    public double getCharge() {
        int result = 0;
        switch (this.getMovie().getPriceCode()) {
            case Movie.CHILDRENS:
                result += 2;
                if (this.getDayRented() > 2) {
                    result += (this.getDayRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                result += this.getDayRented() * 3;
                break;
            case Movie.REGULAR:
                result += 1.5;
                if (this.getDayRented() > 3) {
                    result += (this.getDayRented() - 3) * 1.5;
                }
                break;
        }
        return result;
    }
    public int getFrequentRenterPoints(){
        if ((this.getMovie().getPriceCode()==Movie.NEW_RELEASE)&&this.getDayRented()>1){
            return 2;
        }
        else {
            return 1;
        }
    }
}
