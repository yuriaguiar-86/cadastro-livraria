
import br.edu.imepac.entidades.Livro;
import br.edu.imepac.servicos.LivroServico;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Incubadora02
 */
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = teclado.nextLine();
        System.out.println("Auto: ");
        String autor = teclado.nextLine();
        
        Livro livro = new Livro();
        livro.setNome(nome);
        livro.setAutor(autor);
        
        LivroServico livroServico;
        try {
            livroServico = new LivroServico();
            livroServico.cadastrar(livro);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro, não foi possível realizar o cadastro!");
        } 
        
    }
}
