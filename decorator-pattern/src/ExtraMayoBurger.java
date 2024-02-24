public class ExtraMayoBurger extends BurgerDecorator{
    private final Burger burger;

    public ExtraMayoBurger(Burger burger) {
        this.burger = burger;
    }
    @Override
    public int getCost() {
        return this.burger.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return this.burger.getDescription() + " with extra mayo";
    }
}
