package com.models;

/**
 * Created by Администратор on 14.07.2016.
 */
public class Kids extends GrandParents {
    private GrandParents grandParents;
    private Parents parents;

    public GrandParents getGrandParents() {
        return grandParents;
    }

    public void setGrandParents(GrandParents grandParents) {
        this.grandParents = grandParents;
    }

    public Parents getParents() {
        return parents;
    }

    public void setParents(Parents parents) {
        this.parents = parents;
    }

    public void relax() {
        if (getGender().equals("М")) System.out.println(" грається з м'ячем.");
        else System.out.println(" грається з ляльками.");
    }

    public void work() {
        if (getGender().equals("М")) System.out.println(" пропалює скатерть через дідові окуляри.");
        else System.out.println(" накладає землю в тарілки.");
    }

    @Override
    public String toString() {
        return "Kids{" +
                "grandParents='" + grandParents + '\'' +
                ", additional info: " + super.toString() +
                '}';
    }
}
