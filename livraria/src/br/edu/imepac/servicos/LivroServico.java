/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.imepac.servicos;

import br.edu.imepac.daos.LivroDao;
import br.edu.imepac.entidades.Livro;
import java.sql.SQLException;

/**
 *
 * @author Incubadora02
 */
public class LivroServico {
    private LivroDao livroDao;
    
    public LivroServico() throws ClassNotFoundException, SQLException{
        this.livroDao = new LivroDao();
    }
    
    public int cadastrar(Livro livro) throws SQLException{
        return livroDao.salvar(livro);
    }
    
    public Livro pesquisar(Long id) throws SQLException{
        return livroDao.consultar(id);
    }
    
    public int deletar(Livro livro) throws SQLException {
        return livroDao.atualizar(livro);
    }
    
    public int alterar(Livro livro) throws SQLException{
        return livroDao.atualizar(livro);
    }
}
