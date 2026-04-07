package com.prototype.registry;

import com.prototype.model.Animal;
import com.prototype.model.Cow;
import com.prototype.model.Horse;
import com.prototype.model.Sheep;

/**
 * Registry that stores pre-configured prototype instances and
 * hands out clones on demand — without exposing the concrete types.
 *
 * This is the core of the Prototype pattern: clients never call
 * {@code new Sheep(...)}, they simply ask the registry for one.
 */
public class AnimalRegistry {

    private final Sheep sheepPrototype;
    private final Cow   cowPrototype;
    private final Horse horsePrototype;

    public AnimalRegistry() {
        // Pre-configure the prototype objects once.
        sheepPrototype = new Sheep(4, "Baaaa", "grass", "Unnamed Sheep");
        cowPrototype   = new Cow(4, "Moooo", "hay");
        horsePrototype = new Horse(4, "Neigh", "oats", "brown");
    }

    /**
     * Returns a cloned Sheep with the given name.
     *
     * @param name display name for the new sheep
     */
    public Animal createSheep(String name) {
        return sheepPrototype.cloneWithName(name);
    }

    /** Returns a cloned Cow using default prototype values. */
    public Animal createCow() {
        return cowPrototype.clone();
    }

    /** Returns a cloned Horse using default prototype values. */
    public Animal createHorse() {
        return horsePrototype.clone();
    }
}
