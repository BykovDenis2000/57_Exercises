package Exercise_8;

public class PizzasCalc {
    public int people;
    public int pizzas;

    public PizzasCalc(){}
    public PizzasCalc(String people, String pizzas){
        this.people = Integer.parseInt(people);
        this.pizzas = Integer.parseInt(pizzas);
    }
    public String calculate(){
        String res = "";
        if (people < 0 || pizzas < 0) {
            res = "Incorrect numbers";
        } else {
            int leftovers = 0;
            int pieces = 8 * pizzas;
            int each = pieces / people;
            if (pieces % people != 0) {
                leftovers = pieces % people;
            }
            res = (people + " have " + pizzas + " pizzas\n" +
                    "Each person gets " + each + " peaces\n" +
                    leftovers + " leftover peaces");

        }
        return res;
    }
}
