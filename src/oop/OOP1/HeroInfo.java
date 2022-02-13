package oop.OOP1;

public class HeroInfo {

    private String name;
    private int hp = 20;

    public HeroInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
