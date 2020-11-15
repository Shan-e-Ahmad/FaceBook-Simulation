package Test2;

public class Message {

    String msg;
    public void message(User u,String Message)
    {
              msg=Message;
        System.out.println("UserID: " +u.getId());
        System.out.println("Message: " +msg);
    }
}
