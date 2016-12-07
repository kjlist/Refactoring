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
    //本系统可能发生的变化是加入新影片类型
    public double getCharge() {
        return _movie.getCharge(this._daysRented);
    }
    public int getFrequentRenterPoints(){
        return _movie.getFrequentRenterPoints(this._daysRented);
    }
}
