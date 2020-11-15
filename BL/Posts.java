package Test2;

import java.util.ArrayList;

public class Posts{
    int id;
    String PostText;
    ArrayList<User> userLiked;
    ArrayList<Posts> comment;
    ArrayList<Posts> share;
    int likeCount=0; int sharecount=0;

    public Posts(int _id, String _posts) {
        id = _id;
        PostText = _posts;
    }

    public void print() {
        System.out.println("UserID: " +id);
        System.out.println("Post: " +PostText);
    }
    public void LikePosts(Posts pid, User uid)
    {
        id=pid.id;
        userLiked=uid.setLikedPosts(pid);
    }
    public void share(Posts pid, User uid)
    {
        uid.setPosts(pid.share);
        sharecount++;
    }
}
