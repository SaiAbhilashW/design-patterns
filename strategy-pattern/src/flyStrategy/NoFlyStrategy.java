package flyStrategy;

public class NoFlyStrategy implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
