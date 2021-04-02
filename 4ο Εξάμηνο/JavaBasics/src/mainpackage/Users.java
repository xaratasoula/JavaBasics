package mainpackage;

import java.util.Scanner;

public class Users {
    public String username;
    public String password;
    public String name;
    public String surname;
    public int counter=0;
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
    public Users() {
        username="username";
        name="name1";
        surname="surname";
        password="pass1";
    }
    public void login() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String in1 = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + in1);  // Output user input

        Scanner myObj2 = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String in2 = myObj.nextLine();  // Read user input
        System.out.println("Password is: " + in2);  // Output user input
        if(name=="name1" && x1==false) {
            if(password=="pass1") {
                System.out.println("You have logged in succesfully");
                x1=true;}
            else
                System.out.println("wrong password");
        }}
    public void logout() {
        if(x1=true){System.out.println("You have logged out succesfully");
            x1=false;
        }

    }
}