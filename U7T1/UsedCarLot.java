import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

    public UsedCarLot() {
        inventory = new ArrayList<Car>();
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void addCar(Car newAdd) {
        inventory.add(newAdd);
    }

    public boolean swap(int ind1, int ind2) {
        if((ind1 < 0 || ind1 >= inventory.size()) || (ind2 < 0 || ind2 >= inventory.size())) {
            return false;
        } else {
            Car car2 = inventory.get(ind2);
            Car temp = inventory.set(ind1, car2);
            temp = inventory.set(ind2, temp);
            return true;
        }
    }
}
