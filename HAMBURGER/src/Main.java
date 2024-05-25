import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HamburgerKitchen kitchen = HamburgerKitchen.getInstance();

        while (true) {
            System.out.println("Bienvenido al servicio de hamburguesas: ");
            System.out.println("¿Como le gustaria su hamburguesa?  ");
            System.out.println(" Especifique el tipo de carne (beef, chicken, bacon): ");
            String meat = sc.nextLine();

            BurgerBuilder builder = BurgerBuilder.starBuilding();
            builder.setMeat(meat);

            System.out.println("Desea Lechuga: Si/No");
            if (sc.nextLine().trim().equals("Si")) {
                builder.addLettuce();
            }

            System.out.println("Desea Tomate: Si/No");
            if (sc.nextLine().trim().equals("Si")) {
                builder.addTomato();
            }

            System.out.println("Desea Cebolla: Si/No");
            if (sc.nextLine().trim().equals("Si")) {
                builder.addOnion();
            }

            System.out.println("Desea Queso: Si/No");
            if (sc.nextLine().trim().equals("Si")) {
                builder.addCheese();
            }

            Hamburger hamburger = kitchen.orderHamburger(builder);
            System.out.println("Su hamburguesa ya esta lista " + hamburger);


            System.out.println("¿Quisiera pedir otra hamburguesa? : Si/No ");
            String response = sc.nextLine().trim();
            if (!response.equals("Si")) {
                break;
            }

            System.out.println("Gracias por su visita. ");

        }
    }
}