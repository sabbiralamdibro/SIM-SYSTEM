package entity;
// Generated Nov 5, 2018 11:02:08 AM by Hibernate Tools 4.3.1



/**
 * Regisreation generated by hbm2java
 */
public class Regisreation  implements java.io.Serializable {


     private Integer regid;
     private String firstName;
     private String lastName;
     private String gender;
     private String email;
     private String courseName;
     private String phone;
     private String address;

    public Regisreation() {
    }

    public Regisreation(String firstName, String lastName, String gender, String email, String courseName, String phone, String address) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.gender = gender;
       this.email = email;
       this.courseName = courseName;
       this.phone = phone;
       this.address = address;
    }
   
    public Integer getRegid() {
        return this.regid;
    }
    
    public void setRegid(Integer regid) {
        this.regid = regid;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCourseName() {
        return this.courseName;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }




}


