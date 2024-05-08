import fly.FlyBehaviour;
import quack.QuackBehaviour;

public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    void performQuack() {
        quackBehaviour.quack();
    }

    void performFly() {
        flyBehaviour.fly();
    }

    public abstract void display();
}
