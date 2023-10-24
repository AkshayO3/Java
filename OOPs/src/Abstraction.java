/* Abstraction is a process of hiding the implementation details and showing only functionality to the user.
It hides the internal unnecessary details and shows only the functionality. In other words, it is the ability to create
a simple interface to a complex thing. For example, when we use mobile phone, we just type the message and send
the message. We don't know the internal processing about the message delivery.   */

// Abstract class
abstract class Human{
    String color;
    Human(){
        color = "Skin";
    }
    void eat(){
        System.out.println("Animal eats");
    }
    abstract void walk();   // Abstract method
}
class Horse extends Human{
    void walk(){        //Gets implemented in the derived class
        System.out.println("Walks on four legs.");
    }
}

/* Interface is a blueprint of a class. It has static constants and abstract methods only.
    * Used to achieve multiple inheritance and total abstraction.
    * It cannot be instantiated just like the abstract class.
    * By default, the methods in an interface are abstract and public.
 */
interface Fish{
    void swim();
    void eat();
}
class Whale implements Fish {   // Implements keyword is used when interface-->class
    public void swim(){
        System.out.println("Swims in water.");
    }
    public void eat(){
        System.out.println("Eats small fishes.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        System.out.println(h1.color);
        Whale w1 = new Whale();
        w1.swim();
        w1.eat();
    }
}