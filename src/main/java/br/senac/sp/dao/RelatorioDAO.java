/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.dao;

import br.senac.sp.db.ConexaoDB;
import br.senac.sp.entidade.RelatorioCliente;
import br.senac.sp.entidade.RelatorioFilial;
import br.senac.sp.entidade.RelatorioProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oz500
 */
public class RelatorioDAO {

    public static List<RelatorioFilial> gerarResultadoFilial() {

        Connection connection;
        PreparedStatement stmt;
        ResultSet resultSet;

        try {

            List<RelatorioFilial> relatorioList = new ArrayList<>();

            connection = ConexaoDB.getConexao();

            stmt = connection.prepareStatement("select filial.ID_FILIAL, filial.NOME as nome, sum(venda.TOTAL) as total from filial inner join venda on filial.ID_FILIAL = venda.ID_FILIAL group by filial.ID_FILIAL, filial.NOME order by filial.ID_FILIAL");

            resultSet = stmt.executeQuery();

            while (resultSet.next()) {

                RelatorioFilial relatorio = new RelatorioFilial();

                relatorio.setId(resultSet.getInt("ID_FILIAL"));
                relatorio.setNome(resultSet.getString("nome"));
                relatorio.setTotal(resultSet.getDouble("total"));

                relatorioList.add(relatorio);
            }

            stmt.close();
            return relatorioList;

        } catch (SQLException ex) {
            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static List<RelatorioCliente> mostrarRelatorioCliente() {

        Connection connection;
        PreparedStatement stmt;
        ResultSet resultSet;

        try {

            List<RelatorioCliente> relatorioClientList = new ArrayList<>();

            connection = ConexaoDB.getConexao();

            stmt = connection.prepareStatement("select cliente.ID_CLIENTE, cliente.NOME as nome, cliente.SOBRENOME as sobrenome, sum(venda.TOTAL) total from cliente inner join venda on cliente.ID_CLIENTE = venda.ID_CLIENTE group by cliente.ID_CLIENTE, cliente.NOME, cliente.SOBRENOME order by cliente.ID_CLIENTE");

            resultSet = stmt.executeQuery();

            while (resultSet.next()) {

                RelatorioCliente relatorioCliente = new RelatorioCliente();

                relatorioCliente.setId(resultSet.getInt("ID_CLIENTE"));
                relatorioCliente.setNome(resultSet.getString("nome"));
                relatorioCliente.setSobrenome(resultSet.getString("sobrenome"));
                relatorioCliente.setTotal(resultSet.getDouble("total"));

                relatorioClientList.add(relatorioCliente);

            }
            stmt.close();
            return relatorioClientList;

        } catch (SQLException ex) {
            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static List<RelatorioProduto> gerarRelatorioProduto() {

        Connection connection;
        PreparedStatement stmt;
        ResultSet resultSet;

        try {

            List<RelatorioProduto> relatorioProdutoList = new ArrayList<>();

            connection = ConexaoDB.getConexao();

            stmt = connection.prepareStatement("select produto.ID_PRODUTO, produto.NOME as nome, sum(carrinho.QUANTIDADE) as total from produto inner join carrinho on produto.ID_PRODUTO = carrinho.ID_PRODUTO group by produto.ID_PRODUTO,produto.NOME order by produto.ID_PRODUTO");


            resultSet = stmt.executeQuery();

            while (resultSet.next()) {

                RelatorioProduto relatorioProduto = new RelatorioProduto();

                relatorioProduto.setId(resultSet.getInt("ID_PRODUTO"));
                relatorioProduto.setNome(resultSet.getString("nome"));
                relatorioProduto.setTotal(resultSet.getDouble("total"));

                relatorioProdutoList.add(relatorioProduto);

            }
            stmt.close();
            return relatorioProdutoList;

        } catch (SQLException ex) {
            Logger.getLogger(RelatorioDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
