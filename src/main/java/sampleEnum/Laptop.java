package sampleEnum;

public enum Laptop {
    Hp,Lenova(),Dell(25000),Acer;
private int price;
    private Laptop(int price) {
        this.price=price;
    }
    private Laptop(){}

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
