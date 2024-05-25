public class BurgerBuilder implements HamburgerBuilder{
    //private BurgerBuilder burguerBuilder = new BurgerBuilder();
    private String meat;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean onion = false;
    private boolean cheese = false;

    public static BurgerBuilder starBuilding (){
        return new BurgerBuilder();
    }
    @Override
    public HamburgerBuilder setMeat(String meat) {
        this.meat = meat;
        return this;
    }

    @Override
    public HamburgerBuilder addLettuce() {
        this.lettuce = true;
        return this;
    }

    @Override
    public HamburgerBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    @Override
    public HamburgerBuilder addOnion() {
        this.onion = true;
        return this;
    }

    @Override
    public HamburgerBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    @Override
    public Hamburger build() {
        return new Hamburger(meat, lettuce, tomato, onion, cheese);
    }

}
