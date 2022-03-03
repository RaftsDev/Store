

import java.util.ArrayList;

/**
 * Created by dev on 17/10/2015.
 */
public class Cart {
    private String name;
    

    private ArrayList<Store> productsArr = new ArrayList<>();

    public Cart(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addProduct(Store product) {
        if (productsArr.contains(product)) {
            System.out.println(product.getName() + " is already on this team");
            return false;
        } else {
            productsArr.add(product);
            System.out.println(product.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numProducts() {
        return this.productsArr.size();
    }

   /* public void matchResult(Team opponent, int ourScore, int theirScore) {
        if(ourScore > theirScore) {
            won++;
        } else if(ourScore == theirScore) {
            tied++;
        } else {
            lost++;
        }
        played++;
        if(opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }*/

}























