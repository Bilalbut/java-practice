/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userLog;

import Model.User;
import java.util.Scanner;

/**
 *
 * @author Bilal Butt
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User usr = new User();
        
        //Populating the object
        System.out.print("Enter your first Name: \t");
        usr.setFirstName(scan.nextLine());
        
        System.out.print("Enter Your Last Name: \t");
        usr.setLastName(scan.nextLine());
        
        System.out.print("Enter Your Email: \t");
        usr.setEmail(scan.nextLine());
        
        System.out.print("Enter Your Phone: \t");
        usr.setPhoneNo(scan.nextLine());
        
        System.out.print(usr);

    }
}
