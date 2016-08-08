package com.models;

/**
 * Created by Администратор on 14.07.2016.
 */
public class Parents extends GrandParents {
    private GrandParents parents;

    public GrandParents getParents() {
        return parents;
    }

    public void setParents(GrandParents parents) {
        this.parents = parents;
    }

    public void relax() {
        if (getGender().equals("М")) System.out.println(" ловить рибу.");
        else System.out.println(" засмагає на сонці");
    }

    public void work() {
        if (getGender().equals("М")) System.out.println(" розпалює вогонь.");
        else System.out.println(" готує їсти.");
    }

    @Override
    public String toString() {
        return "Parents{" +
                "parents='" + parents + '\'' +
                ", additional info: " + super.toString() +
                '}';
    }
}
