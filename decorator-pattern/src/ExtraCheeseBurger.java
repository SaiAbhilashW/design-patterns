public class ExtraCheeseBurger extends BurgerDecorator{
    private final Burger burger;

    public ExtraCheeseBurger(Burger burger) {
        this.burger = burger;
    }
    @Override
    public int getCost() {
        return this.burger.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return this.burger.getDescription() + " with extra cheese";
    }
}
