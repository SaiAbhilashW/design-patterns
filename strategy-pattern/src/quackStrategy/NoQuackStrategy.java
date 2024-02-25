package quackStrategy;

public class NoQuackStrategy implements QuackStrategy {
    @Override
    public void quack() {
        System.out.println("I can't quack!");
    }
}
