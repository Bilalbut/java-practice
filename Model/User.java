/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bilal Butt
 */
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.phoneNo="";
        this.email="";
        
    }

    public User(String firstName, String lastName, String email, String phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phone_No) {
        this.phoneNo = phone_No;
    }

    @Override
    public String toString() {
        return "\nUser{" + "\n\tfirstName=" + firstName + "\n\tlastName=" + lastName + "\n\temail=" + email + "\n\tphoneNo=" + phoneNo + "\n}";
    }
}
