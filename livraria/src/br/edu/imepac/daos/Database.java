/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.imepac.daos;

import java.sql.SQLException;

/**
 *
 * @author Incubadora02
 */
public interface Database<T> {
    public int salvar(T objeto) throws SQLException;
    public int atualizar(T objeto) throws SQLException;
    public int consultar(T objeto) throws SQLException;
    public int excluir(T objeto) throws SQLException;
}
