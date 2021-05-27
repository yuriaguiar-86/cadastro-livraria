/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.imepac.daos;

import br.edu.imepac.entidades.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Incubadora02
 */
public class LivroDao extends GenericDao implements Database<Livro> {
    
    private Connection connection;
    
    public LivroDao() throws ClassNotFoundException, SQLException{
        super();
    }
    
    @Override
    public int salvar(Livro objeto) throws SQLException {
        String sql = "INSERT INTO livros(nome, autor) VALUES (?, ?)";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, objeto.getNome());
        stm.setString(2, objeto.getAutor());
        return stm.executeUpdate();
    }
    
    @Override
    public int atualizar(Livro livro) throws SQLException {
        String sql = "UPDATE livro SET nome = ?, autor = ? WHERE id = ? ";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, livro.getNome());
        stm.setString(2, livro.getAutor());
        stm.setLong(3, livro.getId());
        return stm.executeUpdate();
    }

    @Override
    public int consultar(Livro livro) throws SQLException {
        String sql = "SELECT * FROM livro WHERE id = ?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setLong(1, livro.getId());
        
        return stm.executeUpdate();
    }
    
    @Override
    public int excluir(Livro livro) throws SQLException {
      String sql = "DELETE FROM livros WHERE id = ? ";
      PreparedStatement stm = connection.prepareStatement(sql);
      stm.setLong(1, livro.getId());
      return stm.executeUpdate();
    }
    
    @Override
    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
}
