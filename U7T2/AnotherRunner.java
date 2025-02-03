package U7T2;
import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args) {
        Car c1 = new Car("Porsche GT3 rs", 0);
        Car c2 = new Car("LambTruck", 100);
        Car c3 = new Car("Tesla Model X", 400);
        Car c4 = new Car("Svj", 0);
        Car[] cars = {c1, c2, c3, c4};
        ArrayList<Car> carsList = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(carsList);
    }
}
