package coffeeMaker;

public abstract class Barista {
    abstract Coffee makeCoffee(MenuItem menuItem);
}

class 공유 extends Barista {

    @Override
    Coffee makeCoffee(MenuItem menuItem) {
        // TODO Auto-generated method stub
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }

}
