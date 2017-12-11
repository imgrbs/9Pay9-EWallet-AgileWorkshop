package app.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Message {
    ArrayList<Message> allMessage = new ArrayList<Message>();

    private int id;
    private String message;

    public Message() {
    }

    public Message(String message) {
        this.message = message;
    }

    public Message(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Message> queryMessage() {
        Connection conn = null;
        try {
            conn = new ConnectionBuilder().getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Sentences");
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                allMessage.add(
                    new Message((res.getInt("id")),res.getString("sentence"))
                );
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allMessage;
    }

}
