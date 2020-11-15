package file;
import java.io.*;
import java.util.Scanner;

public class write {

    public void writing(String filename,String text){

        try{
            String filepath=new File (filename).getAbsolutePath();
            //File obj1=new File(filename);

            try (BufferedWriter obj2 = new BufferedWriter(new FileWriter(filepath, true))) {
                if(text=="newline")
                {
                    obj2.newLine();
                }
                else {


                    obj2.write(text);
                    obj2.write(",");

                }
            }
            System.out.print("File written successfully");

        }
        catch(IOException e)
        {
            System.out.print("Error cannot open File");
            e.printStackTrace();
        }
    }
    public void writing(String filepath,int digit){

        try{


            String filepath1=new File (filepath).getAbsolutePath();
            File obj1=new File(filepath);
            try (BufferedWriter obj2 = new BufferedWriter(new FileWriter(filepath1, true))) {
                obj2.write(digit);
                obj2.write(",");

                System.out.print("File written successfully");
                obj2.close();
            }
        }
        catch(IOException e)
        {
            System.out.print("Error cannot open File");
            e.printStackTrace();
        }
    }

    public void sendfriendrequests(String sender, String s_id,String receiver,String r_id,String cancel,String newline)  {

        read obj=new read();
        obj.reading("C:\\Users\\Lenovo\\IdeaProjects\\sda\\sendfr.txt");
        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\sendfr.txt",newline);
        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\sendfr.txt",sender);
        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\sendfr.txt",s_id);
        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\sendfr.txt",receiver);
        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\sendfr.txt",r_id);
        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\sendfr.txt",cancel);

}
    public void acceptfriendrequests(String sender,String s_id,String receiver,String r_id)
    {
        read obj=new read();
        obj.reading("C:\\Users\\Lenovo\\IdeaProjects\\sda\\receivefr.txt");


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\receivefr.txt","newline");

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\receivefr.txt",sender);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\receivefr.txt",s_id);
        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\receivefr.txt",receiver);

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\receivefr.txt",r_id);


    }

    public void createpost(String postid,String userid,String privacy)
    {
        read obj=new read();
        obj.reading("C:\\Users\\Lenovo\\IdeaProjects\\sda\\video.txt");

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\createpost.txt","newline");
        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\createpost.txt",postid);
        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\createpost.txt",userid);
        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\createpost.txt",privacy);
    }

    public void users(int userid,String email,String name,String date,String gender)
    {
        read obj=new read();
        obj.reading("C:\\Users\\Lenovo\\IdeaProjects\\sda\\users.txt");


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\users.txt","newline");

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\users.txt",userid);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\users.txt",email);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\users.txt",name);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\users.txt",date);

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\users.txt",gender);

    }

    public void posts(int postid,int likes,int comments,int shares)
    {
        read obj=new read();
        obj.reading("C:\\Users\\Lenovo\\IdeaProjects\\sda\\posts.txt");

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\posts.txt","newline");

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\posts.txt",postid);

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\posts.txt",likes);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\posts.txt",comments);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\posts.txt",shares);

    }
    public void friendlist(String userid,String addid)  {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the UserId of User of which you want to add friend ");

        try {
            File obj1 = new File("C:\\Users\\Lenovo\\IdeaProjects\\sda\\friendlist.txt");
            Scanner obj2 = new Scanner(obj1);
            boolean flag=false;

            //to read word by word in a line use 'hasNext()' function instead of 'hasNextLine()'
            while (obj2.hasNextLine()) {
                String data = obj2.next();
                if (data == userid) {

                    FileWriter obj3 = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\sda\\friendlist.txt");
                    obj3.write(data);
                    flag=true;

                }

            }
            if(flag==false)
            {
                FileWriter writefile = new FileWriter("C:\\Users\\Lenovo\\IdeaProjects\\sda\\friendlist.txt");
                writefile. write(userid);
                writefile. write(",");
                writefile. write(addid);

            }
        }


         catch (FileNotFoundException e) {
             System.out.print("Error cannot open File");
             e.printStackTrace();

         } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void groups(String groupid,String groupname,String joins)
    {
        read obj=new read();
        obj.reading("C:\\Users\\Lenovo\\IdeaProjects\\sda\\groups.txt");


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\groups.txt","newline");

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\groups.txt",groupid);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\groups.txt",groupname);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\groups.txt",joins);


    }
    public void messeges(String sendername,String receivername,String totalmsgs )
    {
        read obj=new read();
        obj.reading("C:\\Users\\Lenovo\\IdeaProjects\\sda\\messeges.txt");


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\messeges.txt","newline");

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\messeges.txt",sendername);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\messeges.txt",receivername);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\messeges.txt",totalmsgs);


    }
    public void watchvideos(String userid,String videoid,String likes,String comments,String shares)
    {
        read obj=new read();
        obj.reading("C:\\Users\\Lenovo\\IdeaProjects\\sda\\video.txt");


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\video.txt","newline");

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\video.txt",userid);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\video.txt",videoid);

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\video.txt",likes);

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\video.txt",comments);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\video.txt",shares);



    }

    public void comments(String userid,String postid,String comment_likes,String comment_replies )
    {
        read obj=new read();
        obj.reading("C:\\Users\\Lenovo\\IdeaProjects\\sda\\comments.txt");

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\comments.txt","newline");

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\comments.txt",userid);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\comments.txt",postid);


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\comments.txt",comment_likes);

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\comments.txt",comment_replies);
    }
    public void updatestatus(String userid,String status_id, String like,String comments,String shares )
    {

        read obj=new read();
        obj.reading("C:\\Users\\Lenovo\\IdeaProjects\\sda\\updatestatus.txt");


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\updatestatus.txt","newline");

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\updatestatus.txt",userid);

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\updatestatus.txt",status_id);

         writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\updatestatus.txt",like);

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\updatestatus.txt",comments);

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\updatestatus.txt",shares);
    }
    public void createpages(String userid,String pageid,String pagename,String pagetype)
    {

        read obj=new read();
        obj.reading("C:\\Users\\Lenovo\\IdeaProjects\\sda\\createpages.txt");


        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\createpages.txt","newline");

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\createpages.txt",userid);

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\createpages.txt",pageid);

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\createpages.txt",pagename);

        writing("C:\\Users\\Lenovo\\IdeaProjects\\sda\\createpages.txt",pagetype);
    }


}
