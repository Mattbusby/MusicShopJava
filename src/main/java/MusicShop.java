import behaviours.ISell;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;

    public MusicShop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addItemToStock(ISell product){
        stock.add(product);
    }

    public void removeItemFromStock(ISell product){
        stock.remove(product);
    }

    public int getNumberOfItemsOfStock(){
        return stock.size();
    }

    public double getTotalPotentialProfit(){
        double total = 0.00;
        for(ISell product:stock){
            total += product.calculateMarkup();
        }
        return total;
    }
}
