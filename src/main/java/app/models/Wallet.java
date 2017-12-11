package app.models;

import app.exception.Over5000BalanceException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Wallet {

    private int userId;
    private int walletId;
    private double balance;

    public Wallet() {
    }
  
    public Wallet(int userId) {
        this.userId = userId;
        Connection conn = null;
        try {
            conn = new ConnectionBuilder().getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Wallets where userId = ?");
            ps.setInt(1, this.userId);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                walletId = res.getInt("id");
                balance = res.getDouble("money");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        Connection conn = null;
        try {
            conn = new ConnectionBuilder().getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Wallets where userId = ?");
            ps.setInt(1, this.userId);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                walletId = res.getInt("id");
                balance = res.getDouble("money");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return balance;
    }

    public boolean addBalance(double balance) throws Over5000BalanceException {
        double newBalance = this.getBalance() + balance;
        if (!isLessThan(newBalance)) {
            throw new Over5000BalanceException();
        }
        if (isLessThan(newBalance)) {
//            add to db
        }
        if (isEqual(newBalance)) {
//            add to db
        }
        return true;
    }

    private boolean isLessThan(double newBalance) {
        return newBalance < 5000;
    }

    private boolean isEqual(double newBalance) {
        return newBalance == 5000;
    }
}
