 public class Hamburger {
        private String meat;
        private boolean lettuce;
        private boolean tomato;
        private boolean onion;
        private boolean cheese;

        public Hamburger(String meat, boolean lettuce, boolean tomato, boolean onion, boolean cheese) {
            this.meat = meat;
            this.lettuce = lettuce;
            this.tomato = tomato;
            this.onion = onion;
            this.cheese = cheese;
        }

        @Override
        public String toString(){
            return "Hamburguer [meat = " + meat + ", lettuce = " + lettuce + ", tomato = " + tomato + ", onion = " + onion + ", cheese = " + cheese ;
        }
        public String getMeat() {

            return meat;
        }

        public void setMeat(String meat) {

            this.meat = meat;
        }

        public boolean isLettuce() {

            return lettuce;
        }

        public void setLettuce(boolean lettuce) {
            this.lettuce = lettuce;
        }

        public boolean isTomato() {
            return tomato;
        }

        public void setTomato(boolean tomato) {
            this.tomato = tomato;
        }

        public boolean isOnion() {
            return onion;
        }

        public void setOnion(boolean onion) {
            this.onion = onion;
        }

        public boolean isCheese() {
            return cheese;
        }

        public void setCheese(boolean cheese) {
            this.cheese = cheese;
        }
    }
}
