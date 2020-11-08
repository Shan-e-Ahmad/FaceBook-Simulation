import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public class ReadFile{
public static void main(String[]args)
{
String mystr;
Scanner s1=new Scanner(System.in);
System.out.print("enter the name of file that you want to read");
mystr =s1.nextLine();
read obj1=new read();
obj1.reading(mystr);

}
}
