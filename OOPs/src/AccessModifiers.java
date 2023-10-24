/* Access Modifier | Class | Package | Subclass | World
 * public           | Y     | Y       | Y        | Y
 * protected        | Y     | Y       | Y        | N
 * default          | Y     | Y       | N        | N
 * private          | Y     | N       | N        | N
 */

// Private values can be read and modified by using getter and setter functions outside the class.
class Bank{
    private int password=98765434;
    int accNo;
    protected String Name;
    public int Balance;
    public int getPassword(){
        return this.password;
    }
    public int setPassword(int pass){
        this.password=pass;
        return this.password;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        System.out.println(b1.accNo);
//        System.out.println(b1.password);    //Returns error as the password is private
        System.out.println(b1.getPassword());
        System.out.println(b1.setPassword(35428967));
    }
}

/* Encapsulation - It is defined as the wrapping up of data under a single unit. It is the mechanism that binds
   together code and the data it manipulates. Another way to think about encapsulation is, it is a protective
   shield that prevents the data from being accessed by the code outside this shield.
   Technically in encapsulation, the variables or data of a class is hidden from any other class and can be
   accessed only through any member function of own class in which they are declared.
   As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.
   Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public
   methods in the class to set and get the values of variables.
 */
