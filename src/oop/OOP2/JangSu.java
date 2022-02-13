package oop.OOP2;

import oop.OOP2.Voong.*;

import java.util.ArrayList;

public class JangSu {
    private int money = 0;
    private ArrayList<Voong> voongs;
    private Safe safe;

    public JangSu() {
        voongs = new ArrayList<>();
        this.voongs.add(new Cream());
        this.voongs.add(new Hot());
        this.voongs.add(new Pat());
        this.safe = new Safe();
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public ArrayList<Voong> getVoongs() {
        return voongs;
    }

    public void setVoongs(ArrayList<Voong> voongs) {
        this.voongs = voongs;
    }

    public Safe getSafe() {
        return safe;
    }

    public void setSafe(Safe safe) {
        this.safe = safe;
    }
}
