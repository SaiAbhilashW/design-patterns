import displayStrategy.DisplayStrategy;
import flyStrategy.FlyStrategy;
import quackStrategy.QuackStrategy;

public class Duck {
    DisplayStrategy displayStrategy;
    FlyStrategy flyStrategy;
    QuackStrategy quackStrategy;

    public Duck(DisplayStrategy displayStrategy, FlyStrategy flyStrategy, QuackStrategy quackStrategy) {
        this.displayStrategy = displayStrategy;
        this.flyStrategy = flyStrategy;
        this.quackStrategy = quackStrategy;
    }

    public void printProperties() {
        this.displayStrategy.show();
        this.quackStrategy.quack();
        this.flyStrategy.fly();
    }
}
