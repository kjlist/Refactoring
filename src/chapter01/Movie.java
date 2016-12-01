package chapter01;

/**
 * Created by laoli on 16/12/1.
 */
public class Movie {
    public static final int CHILDRENS =2;
    public static final int REGULAR =0;
    public static final int NEW_RELEASE =1;
    private String _title;
    private int _priceCode;

    public Movie(String _title, int _priceCode) {
        this._title = _title;
        this._priceCode = _priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }

    public String getTitle() {
        return _title;
    }
}
