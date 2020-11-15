package Test2;

public class Status {

    int id;
    String Status;

    public Status(int _id, String _status) {
        id = _id;
        Status = _status;
    }

    public void updateStatus() {
        System.out.println("UserID: " +id);
        System.out.println("Status: " +Status);
    }
}
