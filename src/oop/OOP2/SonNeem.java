package oop.OOP2;

import oop.OOP2.Voong.Cream;
import oop.OOP2.Voong.Hot;
import oop.OOP2.Voong.Pat;
import oop.OOP2.Voong.Voong;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SonNeem {
    private int money = 10000;
    private Voong cream;
    private Voong hot;
    private Voong pat;
    private List<Voong> voongs;

    public SonNeem() {
        voongs = new ArrayList<>();
        this.cream = new Cream();
        this.hot = new Hot();
        this.pat = new Pat();
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money -= money;
    }

    public Voong getCream() {
        return cream;
    }

    public void setCream(Voong cream) {
        this.cream = cream;
    }

    public Voong getHot() {
        return hot;
    }

    public void setHot(Voong hot) {
        this.hot = hot;
    }

    public Voong getPat() {
        return pat;
    }

    public void setPat(Voong pat) {
        this.pat = pat;
    }

    public List<Voong> getVoongs() {
        return voongs;
    }

    public void setVoongs(List<Voong> voongs) {
        this.voongs = voongs;
    }
}
