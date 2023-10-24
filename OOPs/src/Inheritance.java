/* Inheritance - Inheritance is a mechanism in which one object acquires all the properties and behaviors of a
                 parent object.     */
class Animal{
    String type;
    String legs;                //  Single level inheritance --> Base(Animal) & Derived(Lion)
}
class Lion extends Animal{
    String mates;               // Multi-level inheritance --> Base(Animal),Lion(Derived1) & Cub(Derived2)
}
class Cub extends Lion{
    int ageInDays;              // Hierarchical Inheritance --> Lion(Base), Lioness & Cub(Derived)
}
class Lioness extends Lion{     // Hybrid Inheritance --> Wherever these types of inheritances mix
    int kids;
}

