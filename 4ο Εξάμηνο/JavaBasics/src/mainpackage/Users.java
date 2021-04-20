package mainpackage;
import java.util.Scanner;
public class Users {
    public String username;
    public String password;
    public String name;
    public String surname;
    public static int Userscounter=0;
    public boolean x1=false;

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name=newName;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String newUsername) {
        this.username=newUsername;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String newSurname) {
        this.surname=newSurname;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String newPassword) {
        this.password=newPassword;
    }

    public Users(String username, String password, String name, String surname) {
        this.username=username;
        this.password=password;
        this.name=name;
        this.surname= surname;
        Userscounter++;

    }

    public void login() throws IllegalArgumentException {
        Scanner for_user = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Time for Login!");
        System.out.println("Enter Username");
        String in1 = for_user.nextLine();  // Read user input
        Scanner for_pass = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Password");
        String in2 = for_pass.nextLine();  // Read user input
        if(username.equals(in1) && x1==false) {
            if(password.equals(in2)) {
                System.out.println("You have logged in succesfully");
                x1=true;
            }
            else {
                System.out.println("wrong password");
            }
        }
        else{
            System.out.println("wrong username");
        }
    }
    public void logout() {
        if(x1=true){System.out.println("You have logged out succesfully");
            x1=false;
        }

    }
    }
