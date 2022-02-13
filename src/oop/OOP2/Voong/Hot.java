package oop.OOP2.Voong;

public class Hot extends Voong {
    private String name = "매운붕어빵";
    private int price = 2000;
    private int count = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

}
