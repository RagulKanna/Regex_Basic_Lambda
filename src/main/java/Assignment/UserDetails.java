package Assignment;

import java.util.Scanner;

public class UserDetails extends Regex {
    public static Scanner scan = new Scanner(System.in);
    public static String first_name, last_name, mail_ID, phone_number, password, check_mail;

    public static void main(String[] args) {
        UserDetails details = new UserDetails();
        details.firstname();
        details.lastname();
        details.mail();

    }


    public static void firstname() {
        System.out.println("\nEnter the first name with first letter capital and name should be minimum 3 letters:");
        first_name = scan.next();
        Regex.name(first_name);
    }

    public static void lastname() {
        System.out.println("\nEnter the last name with first letter capital and name should be minimum 3 letters:");
        last_name = scan.next();
        Regex.name(last_name);
    }

    public static void mail() {
        System.out.println("\nEnter the mail with following valid format:");
        System.out.println("\nFormat is E.g. abc.xyz@bl.co.in (In that abc, bl & co is mandatory)");
        mail_ID = scan.next();
        Regex.mail(mail_ID);
    }
}