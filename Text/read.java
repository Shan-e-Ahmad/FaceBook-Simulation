package file;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class read {
    public void reading(String filename) {

        try {

            String filepath=new File (filename).getAbsolutePath();

            File obj1 = new File(filepath);
            Scanner obj2 = new Scanner(obj1);


            //to read word by word in a line use 'hasNext()' function instead of 'hasNextLine()'
            while (obj2.hasNextLine()) {
                String data = obj2.nextLine();
                System.out.print(data);
                System.out.println("\n");
            }

        } catch (FileNotFoundException e) {
            System.out.print("Error cannot open File");
            e.printStackTrace();
        }

    }
    public void sendfriendrequests(String sender,int s_id,String receiver,int r_id,int cancel)
    {
        reading("C:\\Users\\Lenovo\\IdeaProjects\\sda\\sendfr.txt");

    }
    public void acceptfriendrequests(String sender,int s_id,String receiver,int r_id) {
    reading ("C:\\Users\\Lenovo\\IdeaProjects\\sda\\receiverfr.txt");
    }
    public void createpost(int postid,int userid,String privacy) {
        reading ("C:\\Users\\Lenovo\\IdeaProjects\\sda\\createpost.txt");

    }
    public void users(int userid,String email,String name,String date,String gender) {
        reading ("C:\\Users\\Lenovo\\IdeaProjects\\sda\\users.txt");

    }
    public void posts(int postid,int likes,int comments,int shares) {
        reading ("C:\\Users\\Lenovo\\IdeaProjects\\sda\\posts.txt");

    }
    public void friendlist(String userid,String addid)
    {
        reading ("C:\\Users\\Lenovo\\IdeaProjects\\sda\\friendlist.txt");

    }

    public void groups(int groupid,String groupname,int joins)
    {
        reading ("C:\\Users\\Lenovo\\IdeaProjects\\sda\\groups.txt");


    }
    public void messeges(String sendername,String receivername,int totalmsgs ) {
        reading ("C:\\Users\\Lenovo\\IdeaProjects\\sda\\messeges.txt");

    }
    public void watchvideos(int userid,int videoid,int likes,int comments,int shares) {
        reading ("C:\\Users\\Lenovo\\IdeaProjects\\sda\\video.txt");

    }
    public void comments(int userid,int postid,int comment_likes,int comment_replies ) {
        reading ("C:\\Users\\Lenovo\\IdeaProjects\\sda\\comments.txt");

    }
    public void updatestatus(int userid,int status_id, int like,int comments,int shares ) {
        reading ("C:\\Users\\Lenovo\\IdeaProjects\\sda\\updatestatus.txt");

    }
    public void createpages(int userid,int pageid,String pagename,String pagetype) {
        reading ("C:\\Users\\Lenovo\\IdeaProjects\\sda\\createpages.txt");

    }






    }

