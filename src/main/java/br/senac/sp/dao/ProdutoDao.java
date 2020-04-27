/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.dao;

import br.senac.sp.db.ConexaoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.senac.sp.entidade.Produto;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class ProdutoDao {

    public static boolean cadastrarProduto(Produto produto) {
        boolean cadastrou = false;
        Connection connection;
        try {
            connection = ConexaoDB.getConexao();
            String sql = "insert into produto values (default,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, produto.getNomeProduto());
            preparedStatement.setString(2, produto.getMarca());
            preparedStatement.setLong(3, (long) produto.getPreco());
            preparedStatement.setInt(4, (int) produto.getQuantidade());
            preparedStatement.execute();
            cadastrou = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return cadastrou;
    }

    public static boolean alterarProduto(Produto produto, int codigo) {
        boolean alterou = false;
        Connection connection;

        try {
            connection = ConexaoDB.getConexao();
            String sql = "UPDATE produto SET nome = ? , marca = ? , preco = ?, quantidade = ? WHERE idProduto = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, produto.getNomeProduto());
            preparedStatement.setString(2, produto.getMarca());
            preparedStatement.setLong(3, (long) produto.getPreco());
            preparedStatement.setInt(4, produto.getQuantidade());
            preparedStatement.setInt(5, codigo);
            preparedStatement.execute();
            alterou = true;
        } catch (SQLException a) {
            a.printStackTrace();
        }
        return alterou;
    }
    
    public static boolean excluirProduto(int codigo) {
boolean excluiu = false;
        Connection connection;
        
        try {
            connection = ConexaoDB.getConexao();

            String sql = "DELETE FROM produto WHERE idProduto = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, codigo);
            preparedStatement.execute();
            excluiu = true;
        } catch (SQLException a) {
            a.printStackTrace();
        }

        return excluiu;
    }
}
