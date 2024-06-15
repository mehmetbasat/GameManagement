package Entities;

import Abstract.Entity;

public class Campaign implements Entity {
    int id;
    String name;
    int offer;

    public Campaign() {
    }

    public Campaign(int id, String name, int offer) {
        this.id = id;
        this.name = name;
        this.offer = offer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOffer() {
        return offer;
    }

}
