import fly.FlyBehaviour;
import fly.FlyNoWay;
import quack.QuackBehaviour;
import quack.Squeak;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("Wooden Duck");
    }
}
