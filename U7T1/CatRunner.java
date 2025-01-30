import java.util.ArrayList;

public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        Cat Tom = new Cat("Tom");
        Cat Garfield = new Cat("Garfield");
        Cat Ghost = new Cat("Ghost");
        cats.add(Tom);
        cats.add(Garfield);
        cats.add(Ghost);
        System.out.println(cats);
    }
}
