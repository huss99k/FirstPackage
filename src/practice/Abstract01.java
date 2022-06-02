package practice  ;

public class Abstract01 {

    private String name = "";
    private String type = "";
    private boolean isSold = false;
    private int quantity = 0;
    private double  price  = 0.0;


    public Abstract01(String name,String type,boolean isSold,int quantity,double price){

        this.name= name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.isSold = isSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Abstract01{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", isSold=" + isSold +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }



}
