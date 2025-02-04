package U7T3;

import java.util.ArrayList;

public class CustomerCheck {
    /** The check for a customer or group of customers
     *  Guaranteed to contain at least one MenuItem and all entries are non-null
     */
    private ArrayList<MenuItem> check;

    /* Constructor */
    public CustomerCheck(ArrayList<MenuItem> check) {
        this.check = check;
    }

    /** Returns the total of all MenuItem prices on the check,
     *  as described in part (a)
     */
    public double totalPrices() {
        /* to be implemented in part (a) */
        double total = 0;
        for(MenuItem item : check) {
            total += item.getPrice();
        }
        return total;
    }

    /** Returns true if the restaurant’s coupon offer can be applied to this check and
     *  returns false otherwise, as described in part (b) */
    public boolean couponApplies() {
        /* to be implemented in part (b) */
        boolean isSpecial = false;
        for(int i = 0; i < check.size(); i++) {
            if(check.get(i).isDailySpecial()) {
                isSpecial = true;
                break;
            }
        }
        if(totalPrices() >= 40) {
            if(!isSpecial) {
                return true;
            }
        }
        return false;
    }

    /** Calculates the final cost of this check, as described in part (c) */
    public double calculateCheck() {
        /* to be implemented in part (c) */
        int people = 0;
        for(int i = 0; i < check.size(); i++) {
            if(check.get(i).isEntree()) {
                people++;
            }
        }
        double totalCheck = totalPrices();
        if(couponApplies()) {
            totalCheck *= .75;
        }
        if(people >= 6) {
            totalCheck += totalPrices() * .2;
        }
        return totalCheck;
    }
}