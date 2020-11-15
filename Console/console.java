import java.io.*;
import java.util.Scanner;

public interface console {
    public static void main(String[] args) {
        final String TEXT_BLUE = "\u001B[34m"; //Blue
        final String BLACK = "\033[0;30m";   // BLACK
        final String YELLOW = "\033[0;33m";  // YELLOW
        final String WHITE = "\033[0;37m";   // WHITE
        final String BLUE_BACKGROUND = "\033[44m";   // BLUE
        final String BLUE_BOLD = "\033[1;34m";

        int ch=0;
        String mid = new String(new char[60]).replace('\0', ' ');
        String line = new String(new char[48]).replace('\0', '-');
        String emp_line = new String(new char[46]).replace('\0', ' ');
        String semp_line = new String(new char[13]).replace('\0', ' ');
        System.out.println(WHITE+mid+line);
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"WELCOME TO FACEBOOK!"+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"     ***MENU***     "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+" PRESS 1 TO SIGN-IN "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+" PRESS 2 TO SIGN-UP "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.println(WHITE+mid+line);
        System.out.println("\n\n");
        System.out.printf(WHITE+mid+semp_line+TEXT_BLUE+"        Enter:");
        Scanner obj = new Scanner(System.in);  // Create a Scanner object
        int choice = obj.nextInt();  // This method reads the number provided using keyboard

        // Closing Scanner after the use
        //obj.close();

        if(choice==1)
        {
            //getConsoleView().clear();

            System.out.println(WHITE+mid+line);
            System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
            System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"       SIGN-IN      "+semp_line+WHITE+"|"+"\n");
            System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
            System.out.println(WHITE+mid+line);
            System.out.println("\n\n");
            System.out.printf(WHITE+mid+"Enter Email: ");
            Scanner e_obj = new Scanner(System.in);  // Create a Scanner object
            String email = e_obj.nextLine();
            System.out.println("\n\n");
            System.out.printf(WHITE+mid+"Enter Password: ");
            Scanner p_obj = new Scanner(System.in);  // Create a Scanner object
            String password = p_obj.nextLine();
            System.out.println("\n\n");

            System.out.printf(WHITE+mid+semp_line+TEXT_BLUE+"  PRESS 0 TO SIGN-IN: ");
            Scanner obj1 = new Scanner(System.in);  // Create a Scanner object
            int choice1 = obj1.nextInt();

            if(choice1==0)
            {

            }
            else
            {

            }
        }

        else if(choice==2)
        {
            System.out.println(WHITE+mid+line);
            System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
            System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"       SIGN-UP      "+semp_line+WHITE+"|"+"\n");
            System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
            System.out.println(WHITE+mid+line);
            System.out.println("\n\n");
            System.out.println("\n\n");
            System.out.printf(WHITE+mid+"First Name: ");
            Scanner n1_obj = new Scanner(System.in);  // Create a Scanner object
            String fname = n1_obj.nextLine();

            System.out.printf(WHITE+mid+"Last Name: ");
            Scanner n2_obj = new Scanner(System.in);  // Create a Scanner object
            String lname = n2_obj.nextLine();

            System.out.printf(WHITE+mid+"Email: ");
            Scanner e_obj = new Scanner(System.in);  // Create a Scanner object
            String email = e_obj.nextLine();

            System.out.printf(WHITE+mid+"Password: ");
            Scanner p_obj = new Scanner(System.in);  // Create a Scanner object
            String password = p_obj.nextLine();

            System.out.printf(WHITE+mid+"Date of Birth"+"\n");
            System.out.printf(WHITE+mid+"Year | Month | Date"+"\n");
            System.out.printf(WHITE+mid);
            Scanner dob_obj = new Scanner(System.in);  // Create a Scanner object
            String date_ofBirth = dob_obj.nextLine();

            System.out.printf(WHITE+mid+"Gender: ");
            Scanner g_obj = new Scanner(System.in);  // Create a Scanner object
            String gender = g_obj.nextLine();


            System.out.println("\n");
            System.out.println("\n");
            System.out.printf(WHITE+mid+semp_line+TEXT_BLUE+"  PRESS 0 TO SIGN-UP: ");
            Scanner obj2 = new Scanner(System.in);  // Create a Scanner object
            int choice2 = obj2.nextInt();
        }

        else
        {
            System. out. print("\033[H\033[2J");
            System. out. flush();
        }

    }
}
