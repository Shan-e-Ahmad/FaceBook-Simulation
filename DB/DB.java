package database;

import com.sun.jdi.connect.spi.Connection;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.sql.PreparedStatement;
import java.sql.DatabaseMetaData;
import  java.sql.ResultSet;
import java.util.*;

public class DB implements interface{
    Connection conn;

    @Override
    public void print() {

    }

    public DB() {
        String url = "jdbc:sqlserver://DESKTOP-2TIF5O4\\sqlexpress;databaseName=facebook";
        String user = "sa";
        String password = "nameuser";
        try {
            conn = (Connection) DriverManager.getConnection(url, user, password);
            System.out.println("Connected");
        } catch (SQLException e) {
            System.out.println("Not connected");
            e.printStackTrace();
        }
        
        }
@Override
public void like(Post p, String User) {
        try {
        Connection conn = getConnection();
        CallableStatement cstmt = conn.prepareCall("{ call LikeATweet (?,?,?)}");

        String i = Integer.toString(p.postid);
        cstmt.setString(1, User);
        cstmt.setString(2,i);
        cstmt.registerOutParameter(3, java.sql.Types.INTEGER);
        System.out.println("go");
        cstmt.executeUpdate();
        int result = cstmt.getInt(3);
        System.out.println(result);
        }
        catch(SQLException e){
        e.printStackTrace();
        }
        }


@Override
public void share(String userid, String postid) {
        try {
        Connection conn = getConnection();
        CallableStatement cstmt = conn.prepareCall("{ call doReTweet (?,?,?)}");

        cstmt.setString(1, userid);
        cstmt.setString(2, postid);
        cstmt.registerOutParameter(3, java.sql.Types.INTEGER);
        System.out.println("yo");
        cstmt.executeUpdate();
        int result = cstmt.getInt(3);
        System.out.println(result);
        }
        catch(SQLException e){
        e.printStackTrace();
        }
        }

catchup
boolean sendMessage(String sender, String reciever, String Message) {
		try {
			 Connection conn = getConnection();
				
			 CallableStatement cstmt = conn.prepareCall("{ call DirectMesage (?,?,?,?)}");
			 cstmt.setString(1, sender);
			 cstmt.setString(2, reciever);
			 cstmt.setString(3, Message);
			 cstmt.registerOutParameter(4, java.sql.Types.INTEGER);
			 
				
			 boolean r=cstmt.execute();
			 return r;
				
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		return false;
	}
