package com.prototype.model;

/**
 * Prototype interface that all animals must implement.
 * Extends Cloneable to support Java's native cloning mechanism.
 */
public interface Animal extends Cloneable {
    Animal clone();
    void makeSound();
    String getType();
}
