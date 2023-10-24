/*
Package in Java is a mechanism to encapsulate a group of classes, sub packages and interfaces.
package Mypackage   //Syntax
 */


// Method Overloading  [Compile Time Polymorphism]
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
}

// Method Overriding [Run Time Polymorphism]
class Animalx{
    void eat(){
        System.out.println("Eats food");
    }
}
class Deer extends Animalx{         //Executes the functions of the derived class if it's called
    void eat(){
        System.out.println("Eats grass");
    }
}


