package com.gp.persistence;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.junit.Assert.fail;

public class JDBCTests {
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection(){

        try(Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1522:XE",
                "gipoong",
                "1111"
        )){
            System.out.println(con);

        }catch (Exception e){
            fail(e.getMessage());
        }
    }
}
