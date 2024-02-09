package com.example.demo3.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    public int id;
    public String fullname;
    public String dateofbirth;
    public String gender;
    public String email;
    public int mobileNo;
    public String course;
    public String enquiry;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getDateofbirth() {
        return dateofbirth;
    }
    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public String getEnquiry() {
        return enquiry;
    }
    public void setEnquiry(String enquiry) {
        this.enquiry = enquiry;
    }

    
    
}
