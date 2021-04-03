package mainpackage;

public class Doctor extends Users {
    public String specialty;
    public int DoctorId;
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String newSpecialty) {
        this.specialty=newSpecialty;
    }
    public Integer getDoctorId() {
        return DoctorId;
    }
    public void setDOctorId(Integer newDoctorId) {
        this.DoctorId=newDoctorId;
    }

    void Doctor(){
        username="";
        name="name1";
        surname="surname";
        password="pass1";
        DoctorId  = 1100;
        specialty = "";
    }
    public void DocAvailability(){}
    public void DocSchedule(){}

}
