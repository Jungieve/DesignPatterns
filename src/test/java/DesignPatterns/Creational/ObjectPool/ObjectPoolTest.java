package DesignPatterns.Creational.ObjectPool;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;


/**
 * Created by 丛子涵 on 2017/8/22
 */
public class ObjectPoolTest extends TestCase{
    public ObjectPoolTest(String testName) {
        super(testName);
    }

    protected final Logger logger = Logger.getLogger(this.getClass().getName());
    private JDBCConnectionPool pool;

    public void testObjectPool() throws Exception {
        pool = new JDBCConnectionPool(
                "com.mysql.jdbc.Driver", "jdbc:mysql://localhost:3306/world",
                "root", "congzihan123");
        // Get a connection:
        Connection con = pool.acquire();

        // Use the connection
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM CITY;");
            while (rs.next()) {
                logger.info("ID:" + rs.getInt(1) + "\tName:" + rs.getString(2) + "\tDistrict:" + rs.getString(3) + "\tPopulation:" + rs.getString(4));
            }
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Return the connection:
            pool.release(con);
        }
    }

    public static Test suite() {
        return new TestSuite(ObjectPoolTest.class);
    }


}