/* Constructor is a special method which is invoked automatically at the time of object creation.
    * Rules for creating Java constructor.
    * Constructor name must be same as its class name
    * Constructor must have no explicit return type
    * Constructor can be only called once.
    * Memory allocation for an object will be done only after calling its constructor.
 */

/*  Constructor Overloading - When multiple constructors are present in a class with different parameters then it is
    known as constructor overloading.
    * Constructor overloading is used to provide different ways of initializing an object.
    * Constructor overloading is similar to method overloading.
    * Constructor overloading is different from method overloading because constructor can't be inherited whereas method
      can be inherited. */

/* Constructor Chaining - Constructor chaining is the process of calling one constructor from another constructor
    with respect to current object.
    * Constructor chaining can be done in two ways:
        1. Within same class: It can be done using this() keyword for constructors in same class
        2. From base class: by using super() keyword to call constructor from the base class.
    * Why do we need constructor chaining?
        1. To reuse the code of constructor from one class to another class.
        2. For better readability of the program.
*/

/*
    Shallow Copy - Shallow copy is a bit-wise copy of an object. A new object is created that has an exact copy of the
                   values in the original object. If any of the fields of the object are references to other objects,
                   just the reference addresses are copied i.e., only the memory address is copied.
    Deep Copy- A deep copy copies all fields, and makes copies of dynamically allocated memory pointed to by the fields.
               A deep copy occurs when an object is copied along with the objects to which it refers.
 */

class Pen{
    String color;
    String tip;
    int[] modelNumbers;
    Pen(){
        System.out.println("Default constructor invoked and it contains no parameters.");
    }
    Pen(String c){
        this.color=c;
        System.out.println("Parametrised Constructor invoked and it contains one parameter.");
    }
    Pen(String c,String t){
        this.color=c;
        this.tip=t;
        System.out.println("Parametrised Constructor invoked and it contains two parameters.");
    }
    Pen(Pen p1){
        this.color=p1.color;
        this.tip="65mm";
        this.modelNumbers = p1.modelNumbers;    //Soft Copy
        for(int i=0;i<modelNumbers.length;i++)
            this.modelNumbers[i]=p1.modelNumbers[i];    //Deep Copy
        System.out.println("Copy Constructor invoked and it contains one object of class Pen.");
    }
}
public class Constructor {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        Pen p2 = new Pen("BLack");
        Pen p3 = new Pen("Black","3mm");
        Pen p4 = new Pen(p3);
        System.out.println(p4.tip);
    }
}
