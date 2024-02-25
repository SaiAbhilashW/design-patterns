package quackStrategy;

public class LoudQuackStrategy implements QuackStrategy {

    @Override
    public void quack() {
        System.out.println("I quack loudly!");
    }
}
