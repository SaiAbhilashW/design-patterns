import displayStrategy.BrownDuckDisplayStrategy;
import displayStrategy.WhiteDuckDisplayStrategy;
import flyStrategy.FastFlyStrategy;
import flyStrategy.NoFlyStrategy;
import quackStrategy.LoudQuackStrategy;
import quackStrategy.NoQuackStrategy;

public class Main {
    /*
    To create new Ducks you might have extended the duck class/interface and implemented the methods in the classes yourself
    A brownduck class where you write code for display, fly and quack methods
    A whiteduckk class doing the same. It may be possible that white duck and brown duck have the same code for fly(). Do you write it two times in each class?

    For n properties of a duck, there may be 2^n ducks which can be created, so what do you do? create 2^n subclasses?
    You change this problem from an inheritance problem to a composition problem! Duck is a composition of behaviours/strategies
    Each duck will use one of the strategies for each method of fly(), display() and quack() while creating an object.

    No more 2^n subclasses, just O(n) strategies, pick and choose strategies at runtime

     */
    public static void main(String[] args) {
        Duck firstDuck = new Duck(new BrownDuckDisplayStrategy(), new FastFlyStrategy(), new LoudQuackStrategy());
        firstDuck.printProperties();
        System.out.println("------");
        Duck secondDuck = new Duck(new WhiteDuckDisplayStrategy(), new NoFlyStrategy(), new NoQuackStrategy());
        secondDuck.printProperties();
    }
}
