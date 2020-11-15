import java.io.*;
import java.util.Scanner;

public interface console {

    final String TEXT_BLUE = "\u001B[34m"; //Blue
    final String BLACK = "\033[0;30m";   // BLACK
    final String YELLOW = "\033[0;33m";  // YELLOW
    final String WHITE = "\033[0;37m";   // WHITE
    final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    final String BLUE_BOLD = "\033[1;34m";
    final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    final String WHITE_BACKGROUND = "\033[47m";  // WHITE
    final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    String mid = new String(new char[65]).replace('\0', ' ');
    String line = new String(new char[48]).replace('\0', '-');
    String emp_line = new String(new char[46]).replace('\0', ' ');
    String semp_line = new String(new char[13]).replace('\0', ' ');
    String mid1 = new String(new char[63]).replace('\0', ' ');

    public static void create_post()
    {

    }

    public static void like_post()
    {

    }

    public static void share_post()
    {

    }

    public static void post_comment()
    {

    }

    public static void view_friendlist()
    {

    }

    public static void send_message()
    {

    }

    public static void send_request()
    {

    }

    public static void accept_request()
    {

    }

    public static void view_groups()
    {

    }

    public static void update_status()
    {

    }

    public static void create_page()
    {

    }

    public static void watch_videos()
    {

    }

    public static void fb_menu()
    {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(WHITE+mid1+line+"----");
        System.out.printf(WHITE+mid1+"|"+emp_line+"    "+"|"+"\n");
        System.out.printf(mid1+WHITE+"|"+semp_line+TEXT_BLUE+"        FACEBOOK        "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+emp_line+"    "+"|"+"\n");
        System.out.println(WHITE+mid1+line+"----");
        System.out.println("\n\n\n\n\n\n\n\n");

        System.out.println(WHITE+mid1+line+"----");
        System.out.printf(WHITE+mid1+"|"+emp_line+"    "+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+emp_line+"    "+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+semp_line+TEXT_BLUE+"       ***MENU***       "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+semp_line+TEXT_BLUE+"  1.  CREATE POST!      "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+semp_line+TEXT_BLUE+"  2.  LIKE A POST!      "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+semp_line+TEXT_BLUE+"  3.  POST COMMENT!     "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+semp_line+TEXT_BLUE+"  4.  SHARE A POST!     "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+semp_line+TEXT_BLUE+"  5.  UPDATE STATUS!    "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+semp_line+TEXT_BLUE+"  6.  SEND REQUEST      "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+semp_line+TEXT_BLUE+"  7.  ACCEPT REQUEST!   "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+semp_line+TEXT_BLUE+"  8.  SEND MESSAGE!     "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+semp_line+TEXT_BLUE+"  9.  VIEW FRIENDLIST!  "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+semp_line+TEXT_BLUE+"  10. CREATE PAGES!     "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+semp_line+TEXT_BLUE+"  11. VIEW GROUP!       "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+semp_line+TEXT_BLUE+"  12. WATCH VIDEOS      "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+emp_line+"    "+"|"+"\n");
        System.out.printf(WHITE+mid1+"|"+emp_line+"    "+"|"+"\n");
        System.out.println(WHITE+mid1+line+"----");

        System.out.println("\n");
        System.out.printf(mid1+WHITE+semp_line+TEXT_BLUE+"          ENTER: "+semp_line+WHITE+"\n");
        Scanner obj2 = new Scanner(System.in);  // Create a Scanner object
        int choice2 = obj2.nextInt();

        if(choice2==1)
        {
            create_post();
        }
        else if(choice2==2)
        {
            like_post();
        }
        else if(choice2==3)
        {
            post_comment();
        }
        else if(choice2==4)
        {
            share_post();
        }
        else if(choice2==5)
        {
            update_status();
        }
        else if(choice2==6)
        {
            send_request();
        }
        else if(choice2==7)
        {
            accept_request();
        }
        else if(choice2==8)
        {
            send_message();
        }
        else if(choice2==9)
        {
            view_friendlist();
        }
        else if(choice2==10)
        {
            create_page();
        }
        else if(choice2==11)
        {
            view_groups();
        }
        else if(choice2==12)
        {
            watch_videos();
        }
        else
        {
            fb_wronginput();
        }
    }

    public static void SignUp() {

        //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.println(WHITE+mid+line);
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"       SIGN-UP      "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.println(WHITE+mid+line);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");

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
        System.out.printf(WHITE+mid+semp_line+TEXT_BLUE+"  PRESS 0 TO SIGN-UP "+"\n");
        System.out.printf(WHITE+mid+semp_line+TEXT_BLUE+"PRESS ANY KEY TO EXIT"+"\n");
        System.out.printf(WHITE+mid+semp_line+TEXT_BLUE+"        ENTER:");
        Scanner obj2 = new Scanner(System.in);  // Create a Scanner object
        int choice2 = obj2.nextInt();

        if(choice2==0)
        {
            fb_menu();
        }
        else
        {
            exit();
        }
    }
    public static void fb_wronginput()
    {
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println(WHITE+mid+line);
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"    WRONG CHOICE!   "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"  PRESS M FOR MENU! "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"  PRESS E TO EXIT!! "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.println(WHITE+mid+line);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.printf(WHITE+mid+semp_line+TEXT_BLUE+"         ENTER: ");
        Scanner obj1 = new Scanner(System.in);  // Create a Scanner object
        char choice1 = obj1.next().charAt(0);

        if(choice1=='M')
        {
            fb_menu();
        }

        else if(choice1=='E')
        {
            exit();
        }

        else
        {
            fb_wronginput();
        }
    }
    public static void SignIn() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println(WHITE+mid+line);
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"       SIGN-IN      "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.println(WHITE+mid+line);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        System.out.printf(WHITE+mid+"Enter Email: ");
        Scanner e_obj = new Scanner(System.in);  // Create a Scanner object
        String email = e_obj.nextLine();
        System.out.printf(WHITE+mid+"Enter Password: ");
        Scanner p_obj = new Scanner(System.in);  // Create a Scanner object
        String password = p_obj.nextLine();
        System.out.println("\n\n");

        System.out.printf(WHITE+mid+semp_line+TEXT_BLUE+"  PRESS 0 TO SIGN-IN "+"\n");
        System.out.printf(WHITE+mid+semp_line+TEXT_BLUE+"PRESS ANY KEY TO EXIT"+"\n");
        System.out.printf(WHITE+mid+semp_line+TEXT_BLUE+"        ENTER:");
        Scanner obj2 = new Scanner(System.in);  // Create a Scanner object
        int choice2 = obj2.nextInt();

        if(choice2==0)
        {
            fb_menu();
        }
        else
        {
            exit();
        }
    }

    public static void WrongInput()
    {
        System.out.println("\n\n\n\n\n\n\n\n\n\n");
        System.out.println(WHITE+mid+line);
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"    WRONG CHOICE!   "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"  PRESS M FOR MENU! "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+semp_line+TEXT_BLUE+"  PRESS E TO EXIT!! "+semp_line+WHITE+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.printf(WHITE+mid+"|"+emp_line+"|"+"\n");
        System.out.println(WHITE+mid+line);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.printf(WHITE+mid+semp_line+TEXT_BLUE+"         ENTER: ");
        Scanner obj1 = new Scanner(System.in);  // Create a Scanner object
        char choice1 = obj1.next().charAt(0);

        if(choice1=='M')
        {
            menu();
        }

        else if(choice1=='E')
        {
            exit();
        }

        else
        {
            WrongInput();
        }
    }

    public static void menu()
    {
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
            SignIn();
        }

        else if(choice==2)
        {
            SignUp();
        }

        else if(choice==0)
        {
            exit();
        }
        else
        {
            WrongInput();
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
