import java.util.Scanner;

public interface WrongInput {
    public static void menu()
    {
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
        //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
            console.menu();
        }

        else if(choice1=='E')
        {
            console.exit();
        }

        else
        {
            WrongInput.menu();
        }
    }
}
