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
