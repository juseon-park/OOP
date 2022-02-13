package oop.OOP2;

import oop.OOP2.Voong.*;

public class Voongs {
    private Voong cream;
    private Voong hot;
    private Voong pat;

    public Voongs() {
        this.cream = new Cream();
        this.hot = new Hot();
        this.pat = new Pat();
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
}
