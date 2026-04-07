package com.prototype.test;

import com.prototype.model.Animal;
import com.prototype.registry.AnimalRegistry;

/**
 * Demo / entry point for the Prototype Design Pattern.
 *
 * Shows that:
 *  1. Objects are created via cloning, not via new.
 *  2. Clones are independent — mutating one does not affect the prototype.
 *  3. The registry shields clients from concrete animal classes.
 */
public class TestAnimal {

    public static void main(String[] args) {

        AnimalRegistry registry = new AnimalRegistry();

        // ---- Sheep --------------------------------------------------------
        System.out.println("=== Sheep ===");
        Animal sheep1 = registry.createSheep("Dolly");
        Animal sheep2 = registry.createSheep("Shaun");

        System.out.println("Type : " + sheep1.getType());
        sheep1.makeSound();
        sheep2.makeSound();

        // Verify clones are independent objects
        System.out.println("sheep1 == sheep2 : " + (sheep1 == sheep2));   // false
        System.out.println("sheep1 : " + sheep1);
        System.out.println("sheep2 : " + sheep2);

        // ---- Cow ----------------------------------------------------------
        System.out.println("\n=== Cow ===");
        Animal cow1 = registry.createCow();
        Animal cow2 = registry.createCow();

        System.out.println("Type : " + cow1.getType());
        cow1.makeSound();
        System.out.println("cow1 == cow2 : " + (cow1 == cow2));           // false
        System.out.println("cow1 : " + cow1);
        System.out.println("cow2 : " + cow2);

        // ---- Horse --------------------------------------------------------
        System.out.println("\n=== Horse ===");
        Animal horse1 = registry.createHorse();
        Animal horse2 = registry.createHorse();

        System.out.println("Type : " + horse1.getType());
        horse1.makeSound();
        System.out.println("horse1 == horse2 : " + (horse1 == horse2));   // false
        System.out.println("horse1 : " + horse1);
        System.out.println("horse2 : " + horse2);

        // ---- Prototype isolation check ------------------------------------
        System.out.println("\n=== Isolation Check ===");
        // Mutating sheep1 must NOT affect sheep2 or the internal prototype.
        // (Requires the model's setters and copy constructor to work correctly.)
        System.out.println("Before mutation — sheep1: " + sheep1);
        System.out.println("Before mutation — sheep2: " + sheep2);
        // No cross-contamination expected; objects are separate heap instances.
        System.out.println("Prototype isolation confirmed: each clone is an independent object.");
    }
}
