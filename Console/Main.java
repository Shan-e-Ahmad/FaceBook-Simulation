package database;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter User ID- ");
        int a = sc1.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Create a Post ");
        String str = sc.nextLine();

        int b= sc1.nextInt();
        Posts post1 = new Posts(a,str,b);
        post1.print();
        System.out.println("Welcome to the FaceBook");
        System.out.println("login or create an account ");
        int c;
        string name;
        string password;
        string confirmpassword;
        string dob;
        string email;
        string gender;
        if (c=1) {
            System.out.println("enter username",+name);
            System.out.println("enter password",+password);



        }
        else {
            System.out.println("enter username",+name);
            System.out.println("enter email",+email);
            System.out.println("enter password",+password);
            System.out.println("enter confirmpassword",+confirmpassword);
            System.out.println("enter date of birth",+dob);
            System.out.println("enter gender,+gender);






        }
    }
}






