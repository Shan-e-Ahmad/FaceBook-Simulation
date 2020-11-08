import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;

public class WriteFile{
public static void main(String[]args)
{
String str;
Scanner s1=new Scanner(System.in);
System.out.print("enter the name of file that you want to write");
str =s1.nextLine();
write myobj=new write();
myobj.writing(str);

}
}