/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.imepac.daos;

import br.edu.imepac.entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Incubadora02
 */
public class ClienteDao extends GenericDao implements Database<Cliente> {
    
    private Connection connection;
    
    public ClienteDao() throws ClassNotFoundException, SQLException{
        super();
    }
    
    @Override
    public int salvar(Cliente objeto) throws SQLException {
        String sql = "INSERT INTO clientes(nome, cpf, email) VALUES (?, ?, ?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, objeto.getNome());
        stm.setString(2, objeto.getCpf());
        stm.setString(3, objeto.getEmail());
        return stm.executeUpdate();
    }
    
    @Override
    public int atualizar(Cliente cliente) throws SQLException {
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, email = ? WHERE id = ?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, cliente.getNome());
        stm.setString(2, cliente.getCpf());
        stm.setString(3, cliente.getEmail());
        stm.setLong(4, cliente.getId());
        return stm.executeUpdate();
    }

    @Override
    public int consultar(Cliente cliente) throws SQLException {
        String sql = "SELECT * FROM cliente WHERE id = ?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setLong(1, cliente.getId());
        
        return stm.executeUpdate();
    }
    
    @Override
    public int excluir(Cliente cliente) throws SQLException {
      String sql = "DELETE FROM clientes WHERE cpf = '?' ";
      PreparedStatement stm = connection.prepareStatement(sql);
      stm.setLong(1, cliente.getId());
      return stm.executeUpdate();
    }
    
    @Override
    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    
    
}
