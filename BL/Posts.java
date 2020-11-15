package Test2;

import java.util.ArrayList;

public class Posts{
    int id;
    String PostText;
    ArrayList<String> userLiked;
    ArrayList<Posts> comment;
    ArrayList<Posts> share;

    public Posts(int _id, String _posts) {
        id = _id;
        PostText = _posts;
    }

    public void print() {
        System.out.println("UserID: " +id);
        System.out.println("Post: " +PostText);
    }
}
