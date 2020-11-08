package database;

import java.util.ArrayList;

class Posts implements interfaces {
    public String Posttext;
    int id;
    int userid;
    String PostText;
    ArrayList<String> userLiked;
    ArrayList<Posts> comment;
    ArrayList<Posts> share;

    public Posts(int _id, String _posts,int _userid) {
        id = _id;
        PostText = _posts;
        userid=_userid;
    }

    public void print() {
        System.out.println("UserID: " +id);
        System.out.println("Post: " +PostText);
    }

    @Override
    public void addpost(Posts p) {

    }
}
