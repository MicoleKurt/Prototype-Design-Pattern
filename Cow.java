package com.prototype.model;

/**
 * Concrete prototype: Cow.
 */
public class Cow implements Animal {

    private int legs;
    private String sound;
    private String food;

    public Cow(int legs, String sound, String food) {
        this.legs  = legs;
        this.sound = sound;
        this.food  = food;
    }

    private Cow(Cow source) {
        this.legs  = source.legs;
        this.sound = source.sound;
        this.food  = source.food;
    }

    @Override
    public Cow clone() {
        return new Cow(this);
    }

    @Override
    public void makeSound() {
        System.out.println("Cow says: " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    // ---------- Getters & Setters ----------

    public int getLegs()          { return legs; }
    public void setLegs(int legs) { this.legs = legs; }

    public String getSound()            { return sound; }
    public void setSound(String sound)  { this.sound = sound; }

    public String getFood()           { return food; }
    public void setFood(String food)  { this.food = food; }

    @Override
    public String toString() {
        return String.format("Cow{legs=%d, sound='%s', food='%s'}", legs, sound, food);
    }
}
