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
import java.util.logging.Level;
import java.util.logging.Logger;
import br.senac.sp.entidade.Produto;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
            String sql = "INSERT INTO produto VALUES (default,?,?,?,?)";
            PreparedStatement PreparedStatement = connection.prepareStatement(sql);

            PreparedStatement.setString(1, produto.getNomeProduto());
            PreparedStatement.setString(2, produto.getMarca());
            PreparedStatement.setLong(3, (long) produto.getPreco());
            PreparedStatement.setInt(4, (int) produto.getQuantidade());
            PreparedStatement.execute();
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
            String sql = "UPDATE produto SET nome = ?,marca = ?,preco = ?,quantidade = ? WHERE ID_PRODUTO = ?";
            PreparedStatement PreparedStatement = connection.prepareStatement(sql);

            PreparedStatement.setString(1, produto.getNomeProduto());
            PreparedStatement.setString(2, produto.getMarca());
            PreparedStatement.setLong(3, (long) produto.getPreco());
            PreparedStatement.setInt(4, (int) produto.getQuantidade());
            PreparedStatement.setInt(5, codigo);
            PreparedStatement.execute();
            alterou = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return alterou;
    }

    public static boolean excluirProduto(int codigo) {
        Connection connection;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean excluiu = false;
        try {
            connection = ConexaoDB.getConexao();
            String sql = "delete  from produto where ID_PRODUTO = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, codigo);
            preparedStatement.execute();
            excluiu = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return excluiu;

    }

    public static List<Produto> listarProduto() {
        Connection connection;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connection = ConexaoDB.getConexao();

            pstmt = connection.prepareStatement(
                    "SELECT * FROM produto ORDER BY ID_PRODUTO");

            rs = pstmt.executeQuery();

            List lista = new ArrayList<>();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCodigo(rs.getInt("ID_PRODUTO"));
                produto.setNomeProduto(rs.getString("nome"));
                produto.setMarca(rs.getString("marca"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setQuantidade(rs.getInt("quantidade"));

                lista.add(produto);

            }

            return lista;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;

        }
    }
}
