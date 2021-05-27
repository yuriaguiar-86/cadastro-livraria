/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.imepac.servicos;

import br.edu.imepac.daos.ClienteDao;
import br.edu.imepac.entidades.Cliente;
import java.sql.SQLException;

/**
 *
 * @author Incubadora02
 */
public class ClienteServico {
    private ClienteDao clienteDao;
    
   public ClienteServico(){
       this.clienteDao = clienteDao;
   }
   
   public int cadastrar(Cliente cliente) throws SQLException{
        return clienteDao.salvar(cliente);
    }
}
