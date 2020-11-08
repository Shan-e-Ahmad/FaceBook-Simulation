
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
public class write{
public void writing(String str){

try{

File obj1=new File(str);
if(!obj1.exists())
{
obj1.createNewFile();

}

FileWriter obj2= new FileWriter(str);
obj2. write(str);
System.out.print("File written successfully");



}
catch(FileNotFoundException e)
{
System.out.print("Error cannot open File");
e.printStackTrace();
}
}
}