import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.get_verified());
        s.set_membership("Gold");
        System.out.println(s.get_membership());




        /*User.admins = new ArrayList<User>();
        User.admins.add(new User("Qais","Gold"));
        User.admins.add(new User("Qais2","Bronze"));
        User.admins.add(new User("Qais3","Silver"));

        User.print_admin_names();*/
    }
}
