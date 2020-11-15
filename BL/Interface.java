package Test2;
import java.sql.Connection;
import java.util.ArrayList;
interface Interfaces {

Connection getConnection();
        public void updateStatus();
        public boolean equals(Object o);
        public int hashCode();
        public String toString();
        public void print();
        public void message(User u,String Message);
        public void LikePosts(Posts pid, User uid);
        public void share(Posts pid, User uid);
        void GroupView(String GroupName);

        }
