package chapter01;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by laoli on 16/12/1.
 */
public class Customer {
    private String _name;
    private Vector _rentals=new Vector();

    public Customer(String _name) {
        this._name = _name;
    }

    public void addRental(Rental arg){
        _rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement(){
//        int frequentRenterPoints=0;
//        Enumeration retals=_rentals.elements();
        String result="Rental Record for"+getName()+"\n";
//        while (retals.hasMoreElements()){
//            Rental each= (Rental) retals.nextElement();
////          switch语句提炼到独立函数中
//            //提炼函数时,我们必须知道可能出什么错
//            //1.找出函数中的局部变量和参数,each和thisAmount,前者并未被修改,后者会被修改
//            //任何不会被修改的变量都可以被我当成参数传入新的函数,至于会被修改的变量就需要格外小心,
//            //如果有一个变量会被修改,我们可以把它当做返回值
//            //add frequent renter point
//            frequentRenterPoints+=each.getFrequentRenterPoints();
//            //show figure for this rental
//            result+="\t"+each.getMovie().getTitle()+"\t"+String.valueOf(each.getCharge())+"\n";
//            totalAmount += each.getCharge();
//        }
        //add footer lines
        result+="Amount owed is"+String.valueOf(getTotalCharge())+"\n";
        result+="You earned"+String.valueOf(getTotalFrequentRenterPoints())+"frequent renter points";
        return result;
    }

    private int getTotalFrequentRenterPoints() {
        int result=0;
        Enumeration retals=_rentals.elements();
        while (retals.hasMoreElements()){
            Rental each= (Rental) retals.nextElement();
            result+=each.getFrequentRenterPoints();
        }
        return result;
    }

    private double getTotalCharge() {
        double result=0;
        Enumeration retals=_rentals.elements();
        while (retals.hasMoreElements()){
            Rental each= (Rental) retals.nextElement();
            result += each.getCharge();
        }
        return result;
    }
}
