import java.io.*;
import java.util.Scanner;

public interface console {
    public static void menu()
    {
        final String TEXT_BLUE = "\u001B[34m"; //Blue
        final String BLACK = "\033[0;30m";   // BLACK
        final String YELLOW = "\033[0;33m";  // YELLOW
        final String WHITE = "\033[0;37m";   // WHITE
        final String BLUE_BACKGROUND = "\033[44m";   // BLUE
        final String BLUE_BOLD = "\033[1;34m";

        int ch=0;
        String mid = new String(new char[65]).replace('\0', ' ');
        String line = new String(new char[48]).replace('\0', '-');
        String emp_line = new String(new char[46]).replace('\0', ' ');
        String semp_line = new String(new char[13]).replace('\0', ' ');
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println(WHITE+mid+line);
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"WELCOME TO FACEBOOK!"+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"     ***MENU***     "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+" PRESS 1 TO SIGN-IN "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+" PRESS 2 TO SIGN-UP "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+" PRESS 0 TO LEAVE!! "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.println(WHITE+mid+line);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.printf(WHITE+mid+semp_line+TEXT_BLUE+"        ENTER:");
        Scanner obj = new Scanner(System.in);  // Create a Scanner object
        int choice = obj.nextInt();  // This method reads the number provided using keyboard

        // Closing Scanner after the use
        //obj.close();

        if(choice==1)
        {
            SignIn.menu();
        }

        else if(choice==2)
        {
            SignUp.menu();
        }

        else if(choice==0)
        {
            exit();
        }
        else
        {
            WrongInput.menu();
        }
    }

    public static void exit()
    {
        return;
    }

    public static void main(String[] args)
    {
    menu();
    }
}
