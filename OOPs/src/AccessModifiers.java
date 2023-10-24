/* Access Modifier | Class | Package | Subclass | World
 * public           | Y     | Y       | Y        | Y
 * protected        | Y     | Y       | Y        | N
 * default          | Y     | Y       | N        | N
 * private          | Y     | N       | N        | N
 */
class Bank{
    private int password;
    int accNo;
    protected String Name;
    public int Balance;
}
public class AccessModifiers {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        System.out.println(b1.accNo);
        System.out.println(b1.password);    //Returns error as the password is private
    }
}
