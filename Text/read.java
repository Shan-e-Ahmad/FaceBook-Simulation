import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
public class read{

    public void reading(String str){

        try{


            File obj1=new File(str);
            Scanner obj2=new Scanner(obj1);

            if (!obj1.exists())
            {
                //obj1.createNewFile();
            }
            //to read word by word in a line use 'hasNext()' function instead of 'hasNextLine()'
            while(obj2.hasNextLine())
            {
                String data= obj2.nextLine();
                System.out.print(data);
                System.out.println("\n");
            }
            obj2.close();

        }
        catch(FileNotFoundException e)
        {
            System.out.print("Error cannot open File");
            e.printStackTrace();
        }

    }

}