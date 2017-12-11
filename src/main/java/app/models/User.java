package app.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class User {
    private int id;
    private String name;
    private String surname;

    private Wallet wallet;

    public User() {}

    public User(int index) {
        Connection conn = null;
        try {
            conn = new ConnectionBuilder().getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Users where id = ?");
            ps.setInt(1, index);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                id = res.getInt("id");
                name = res.getString("name");
                surname = res.getString("surname");
                wallet = new Wallet(id);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public static User getUser(int index) {
        User user = new User(index);
        return user;
    }

}
