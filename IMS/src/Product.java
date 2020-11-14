public class Product {
    String id;
    String name;
    String category;
    float salesPrice;
    float cost;
    int quantity;
    boolean active;

    public float getProfitOrLoss(){
        return salesPrice-cost;
    }

    public void activate(){
        active=true;
    }

    public void inactivate(){
        active=false;
    }

    public boolean getThreshold(){
        return quantity<100;
    }

}
