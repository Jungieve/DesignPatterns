package DesignPatterns.Creational.ObjectPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by 丛子涵 on 2017/8/21
 */
public class JDBCConnectionPool extends ObjectPool<Connection> {
    private String url, user, pwd;

    public JDBCConnectionPool(String driver, String url, String user, String pwd) {
        super();
        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.url = url;
        this.user = user;
        this.pwd = pwd;
    }

    @Override
    protected Connection create() {
        try {
            return (DriverManager.getConnection(url, user, pwd));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean validate(Connection object) {
        try {
            return !object.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    @Override
    public void expire(Connection object) {
        try {
            object.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
