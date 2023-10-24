/* Static keyword in Java is used to share the same variable or method of a given class. It's used in following context:
    1. Static variable
    2. Static method
    3. Static block
    4. Static nested class
    5. Static import
*/

/* super keyword is used to refer to immediate parent's class object.
    - To access parent's properties.
    - To invoke parent's constructor.
    - To invoke parent's methods.       */

class Teacher{
    Teacher(){
        System.out.println("Constructor called for teacher.");
    }
    String name;
    int roll;
    static String schoolName;       // Changes for all the objects that are made from this class.
    void getName(){
        System.out.println("Name: "+this.name);
    }
    void setName(String name){
        this.name=name;
    }
}

class Principal extends Teacher{
    Principal(){
        super();    // Calls the constructor of the parent class.
        System.out.println("Constructor called for principal.");
    }
}

public class StaticSuper {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.schoolName = "ST. ANN'S";
        Teacher t2 = new Teacher();
        System.out.println(t2.schoolName);
    }
}