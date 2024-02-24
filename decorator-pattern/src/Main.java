public class Main {
    public static void main(String[] args) {
        /*
        A dummy class called decorator which will use the vanilla object and decorate stuff over it
         */
        TandooriBurger tandooriBurger = new TandooriBurger();
        ExtraCheeseBurger extraCheeseBurger = new ExtraCheeseBurger(tandooriBurger);
        ExtraMayoBurger extraMayoBurger = new ExtraMayoBurger(extraCheeseBurger);
        System.out.println(extraMayoBurger.getCost());
        System.out.println(extraMayoBurger.getDescription());
    }
}
