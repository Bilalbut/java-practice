/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userLog;

/**
 *
 * @author Bilal Butt
 */
public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String phone_No;

    public User() {
    }

    public User(String firstName, String lastName, String email, String phone_No) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone_No = phone_No;
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

    public String getPhone_No() {
        return phone_No;
    }

    public void setPhone_No(String phone_No) {
        this.phone_No = phone_No;
    }

    @Override
    public String toString() {
        return "User{" + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone_No=" + phone_No + '}';
    }
}
