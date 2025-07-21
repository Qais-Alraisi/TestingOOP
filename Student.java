public class Student extends User {
    void verify(){
        System.out.println("Verifying through email");
        set_verified(true);
    }
}
