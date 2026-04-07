## Problem 

Implement the Factory Design Pattern using Pet as the factory interface. The interface declares two methods: makeSound() and play().
Dog and Cat are concrete classes that implement the Pet interface, each providing their own behavior for both methods.
PetRecord holds attributes such as petId, petName, and a reference to a Pet object.
Clinic acts as the client object that uses the factory to create and interact with pets without depending on their concrete classes.



## Class Diagram
<img width="373" height="572" alt="image" src="https://github.com/user-attachments/assets/0aadec0f-fea6-4140-894b-444b6c9f1425" />
