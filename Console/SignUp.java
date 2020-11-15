import java.util.Scanner;

public interface SignUp {
    public static void menu() {
        final String TEXT_BLUE = "\u001B[34m"; //Blue
        final String BLACK = "\033[0;30m";   // BLACK
        final String YELLOW = "\033[0;33m";  // YELLOW
        final String WHITE = "\033[0;37m";   // WHITE
        final String BLUE_BACKGROUND = "\033[44m";   // BLUE
        final String BLUE_BOLD = "\033[1;34m";
        String mid = new String(new char[65]).replace('\0', ' ');
        String line = new String(new char[48]).replace('\0', '-');
        String emp_line = new String(new char[46]).replace('\0', ' ');
        String semp_line = new String(new char[13]).replace('\0', ' ');
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
        System.out.printf(WHITE+mid+semp_line+TEXT_BLUE+"  PRESS 0 TO SIGN-UP: ");
        Scanner obj2 = new Scanner(System.in);  // Create a Scanner object
        int choice2 = obj2.nextInt();
    }
}
