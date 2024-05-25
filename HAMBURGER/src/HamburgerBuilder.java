public interface HamburgerBuilder {
    HamburgerBuilder setMeat (String meat);
    HamburgerBuilder addLettuce();
    HamburgerBuilder addTomato();
    HamburgerBuilder addOnion();
    HamburgerBuilder addCheese();
    Hamburger build();
}
