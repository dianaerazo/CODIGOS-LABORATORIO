public class HamburgerKitchen {
    private static HamburgerKitchen instance;
    private HamburgerKitchen(){}
    public static HamburgerKitchen getInstance(){
        if (instance == null){
            instance = new HamburgerKitchen();
        }
        return instance;
    }

    public Hamburger orderHamburger(HamburgerBuilder builder){
        return builder.build();
    }
}
