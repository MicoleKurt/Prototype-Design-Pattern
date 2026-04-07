package com.prototype.model;

/**
 * Concrete prototype: Sheep.
 * Supports cloning with an optional custom name.
 */
public class Sheep implements Animal {

    private int legs;
    private String sound;
    private String food;
    private String name;

    public Sheep(int legs, String sound, String food, String name) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.name = name;
    }

    /** Copy constructor used by clone(). */
    private Sheep(Sheep source) {
        this.legs  = source.legs;
        this.sound = source.sound;
        this.food  = source.food;
        this.name  = source.name;
    }

    @Override
    public Sheep clone() {
        return new Sheep(this);
    }

    /** Returns a clone with a custom name. */
    public Sheep cloneWithName(String name) {
        Sheep copy = this.clone();
        copy.setName(name);
        return copy;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }

    // ---------- Getters & Setters ----------

    public int getLegs()          { return legs; }
    public void setLegs(int legs) { this.legs = legs; }

    public String getSound()            { return sound; }
    public void setSound(String sound)  { this.sound = sound; }

    public String getFood()           { return food; }
    public void setFood(String food)  { this.food = food; }

    public String getName()           { return name; }
    public void setName(String name)  { this.name = name; }

    @Override
    public String toString() {
        return String.format("Sheep{name='%s', legs=%d, sound='%s', food='%s'}", name, legs, sound, food);
    }
}
