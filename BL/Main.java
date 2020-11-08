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


    }
}






