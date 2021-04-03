package mainpackage;
import java.util.Scanner;

public class Patient extends Users{
    public String meetDate;
    public String Day;
    public String time;
    public int MeetingId;
    public static String amka;
    public String getMeetDate() {
        return meetDate;
    }
    public void setName(String newmeetDate) {
        this.meetDate=newmeetDate;
    }
    public String getDay() {
        return Day;
    }
    public void setDay(String newDay) {
        this.Day=newDay;
    }
    public String getTime() {
        return time;
    }
    public void setSurname(String newtime) {
        this.time=newtime;
    }
    public Integer getMeetingId() {
        return MeetingId;
    }
    public void setPassword(Integer newMeetingId) {
        this.MeetingId=newMeetingId;
    }

    void Users(){
        username="";
        name="name1";
        surname="surname";
        password="pass1";
        amka="2345";
    };

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
    public void ArrangeMeeting(){
        meetDate = "12/02/2021";
        Day = "Thursday";
        time = "13:30";
        MeetingId = 0;
    }
    public void SearchMeeting(){
        Scanner objmeet = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your MeetingId");

        String amka = objmeet.nextLine();  // Read user input
        System.out.println("Your AMKA is: " + MeetingId);  // Output user input
        this.MeetingId = MeetingId;

    }
    public void PatientHistory(){
        Scanner objamka = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your AMKA to find your patient history:");

        String amka = objamka.nextLine();  // Read user input
        System.out.println("Your AMKA is: " + amka);  // Output user input
        this.amka = amka;

    }
}
