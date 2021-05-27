/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.imepac.daos;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/**
 *
 * @author Incubadora02
 */
public abstract class GenericDao {
    private Connection connection;
    
    private String host = "jdbc:mysql://localhost3306/livraria";
    private String username = "root";
    private String password = "";
    
    public GenericDao() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        this.connection = DriverManager.getConnection(host, username, password);
        setConnection(connection);
    }
    
    public abstract void setConnection(Connection connection);
      
}
