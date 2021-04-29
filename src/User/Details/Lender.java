/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.Details;

/**
 *
 * @author tanis
 */
public class Lender {
    private int lenderId;
    private String name;
    private String contact;
    private String email;
     private String address;
    private String gender;
    private String job;
    private String LicenseNo;
    private String password;
     Lender(){
         
     }
   

    public Lender(int id, String name, String contact, String email, String address, String gender, String job, String LicenseNo, String password) {
        this.lenderId = id;
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.gender = gender;
        this.job = job;
        this.LicenseNo = LicenseNo;
        this.password = password;
    }

    public int getLenderId() {
        return lenderId;
    }

    public void setLenderId(int lenderId) {
        this.lenderId = lenderId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getLicenseNo() {
        return LicenseNo;
    }

    public void setLicenseNo(String LicenseNo) {
        this.LicenseNo = LicenseNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   
}
