/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadham;

import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dream
 */
public class Projectadham {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection VA=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
            Statement s=VA.createStatement();
            s.execute("create table alola(id_a number primary key ,name_a varchar2(20),phone_a number(30),email varchar2(30))");
            System.out.println("done");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Projectadham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
