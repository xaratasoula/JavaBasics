package mainpackage;
import java.util.Scanner;
public class Patient extends Users{
    void Users(){
        username="";
        name="name1";
        surname="surname";
        password="pass1";
        amka="2345";
    };
    public static String amka;
    public void get_set() {
        Scanner obj3 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your AMKA");

        String amka = obj3.nextLine();  // Read user input
        System.out.println("Your AMKA is: " + amka);  // Output user input
        this.amka = amka;
    }

    public void Registration(){
        if ((username=="")||(password=="")){
            Scanner obj4 = new Scanner(System.in);
            System.out.println("Register, name:");

            String username = obj4.nextLine(); // Read user input
            System.out.println("Your name is: " + username);  // Output user input

            Scanner obj5 = new Scanner(System.in);
            System.out.println("Register, pass:");

            String password = obj4.nextLine(); // Read user input
            System.out.println("Your pass is: " + password);  // Output user input
        }

    }
}
