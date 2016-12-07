package chapter01;

/**
 * Created by laoli on 16/12/1.
 */
public class Movie {
    public static final int CHILDRENS =2;
    public static final int REGULAR =0;
    public static final int NEW_RELEASE =1;
    private String _title;
    private Price _price;

    public Movie(String _title, int _priceCode) {
        this._title = _title;
        setPriceCode(_priceCode);
    }

    public int getPriceCode() {
        return _price.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg){
            case REGULAR:
                _price=new RegularPrice();
                break;
            case CHILDRENS:
                _price=new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price=new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    public double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }
    public int getFrequentRenterPoints(int daysRented){
        if (this.getPriceCode()==Movie.NEW_RELEASE&&daysRented>1){
            return 2;
        }
        else {
            return 1;
        }
    }
    public String getTitle() {
        return _title;
    }
}
